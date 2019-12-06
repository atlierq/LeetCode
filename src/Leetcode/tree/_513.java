package Leetcode.tree;

import java.util.*;

public class _513 {
}

class Solution513 {
    Map<Integer, List<Integer>> ans = new HashMap<>();
    int max = Integer.MIN_VALUE;

    public int findBottomLeftValue(TreeNode root) {
        help(root, 1);
        return ans.get(max).get(0);

    }

    public void help(TreeNode root, int level) {

        if (root == null) return;
        if (level > max) max = level;
        if(ans.containsKey(level)){
            ans.get(level).add(root.val);
        }
        else {
            List<Integer> sub = new ArrayList<>();
            sub.add(root.val);
            ans.put(level,sub);
        }
        help(root.left, level + 1);
        help(root.right, level + 1);
    }
}