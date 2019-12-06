package Leetcode.tree;

import java.util.*;

public class _102 {
}

class Solution102 {
    List<List<Integer>> levels = new ArrayList<>();

    public void help(TreeNode node, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        if (node.left != null) {
            help(node.left, level + 1);
        }
        if (node.right != null) {
            help(node.right, level + 1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return levels;
        }
        help(root, 0);
        return levels;
    }
}
