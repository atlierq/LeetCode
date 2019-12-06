package Leetcode.tree;
import java.util.*;
public class _515 {
}

class Solution515 {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        helper(root,0);
        return ans;


    }
    public void helper(TreeNode root,int level){
        if(root == null) return;
        if(ans.size()<level){
            ans.add(root.val);
        }
        if(root.val>ans.get(level)){
            ans.remove(level);
            ans.add(level,root.val);
        }
        helper(root.left,level);
        helper(root.right,level);
    }
}