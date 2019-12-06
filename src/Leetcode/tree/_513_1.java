package Leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _513_1 {
}


class Solution513_1 {
    int max = -1;
    int levelNow = -1;
//    Collections.sort
    public int findBottomLeftValue(TreeNode root) {
        help(root, 1);
        return max;

    }

    public void help(TreeNode root, int level) {

        if (root == null) return;
        if (level > levelNow) {
            max = root.val;
        }

        help(root.left, level + 1);
        help(root.right, level + 1);
    }
}