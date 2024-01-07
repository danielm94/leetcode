package com.github.danielm94.util;

import com.github.danielm94.datastructures.binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.List;

public class TreeNodeUtil {
    private TreeNodeUtil() {
    }

    public static TreeNode getBSTFromIntegerListIteration(List<Integer> list) {
        if (list == null || list.isEmpty() || list.getFirst() == null) return null;

        var queue = new ArrayDeque<TreeNode>();
        var root = new TreeNode(list.getFirst());
        queue.add(root);

        var i = 1;
        while (!queue.isEmpty() && i < list.size()) {
            var current = queue.poll();
            if (list.get(i) != null) {
                current.left = new TreeNode(list.get(i));
                queue.add(current.left);
            }
            i++;

            if (i < list.size() && list.get(i) != null) {
                current.right = new TreeNode(list.get(i));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}
