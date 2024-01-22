package com.github.danielm94.hard;

import java.util.*;

public class CheckingExistenceOfEdgeLinkedLimitedPaths {

    //TODO: SOLVE THIS, USE UNION FIND
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        var result = new boolean[queries.length];
        var nodeMap = new HashMap<Integer, Node>();

        for (var edge : edgeList) {
            var nodeAVal = edge[0];
            var nodeBVal = edge[1];
            var distance = edge[2];

            var nodeA = nodeMap.computeIfAbsent(nodeAVal, this::createNode);
            var nodeB = nodeMap.computeIfAbsent(nodeBVal, this::createNode);
            nodeA.addConnection(nodeB, distance);
            nodeB.addConnection(nodeA, distance);
        }

        for (var i = 0; i < queries.length; i++) {
            var query = queries[i];
            var fromNode = nodeMap.get(query[0]);
            var toNode = nodeMap.get(query[1]);
            if (fromNode == null || toNode == null) continue;
            var limit = query[2];
            result[i] = hasConnection(fromNode, toNode, limit, new HashSet<>());
        }
        return result;
    }

    private boolean hasConnection(Node currNode, Node toNode, int limit, Set<Integer> visited) {
        if (visited.contains(currNode.val)) return false;
        visited.add(currNode.val);

        for (var connection : currNode.connections) {
            if (connection.distance >= limit) continue;
            if (connection.connectedTo.val == toNode.val) return true;
            var hasConnection = hasConnection(connection.connectedTo, toNode, limit, visited);
            if (hasConnection) return true;
        }
        return false;
    }

    private Node createNode(int value) {
        Node node = new Node();
        node.val = value;
        return node;
    }

    private class Node {
        final List<Connection> connections = new ArrayList<>();
        int val;

        void addConnection(Node node, int distance) {
            connections.add(new Connection(node, distance));
        }

        @Override
        public String toString() {
            return String.format(
                    "Node %s",
                    this.val);
        }
    }

    private class Connection {
        Node connectedTo;
        int distance;

        Connection(Node connectedTo, int distance) {
            this.connectedTo = connectedTo;
            this.distance = distance;
        }

        @Override
        public String toString() {
            return String.format(
                    "Connected to %s with distance of %s",
                    this.connectedTo,
                    this.distance);
        }
    }
}
