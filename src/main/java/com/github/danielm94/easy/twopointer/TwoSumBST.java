package com.github.danielm94.easy.twopointer;

import com.github.danielm94.datastructures.binarytree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {
    Set<Integer> complimentSet = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (complimentSet.contains(root.val)) return true;
        complimentSet.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
