package Leetcode.tree;
import java.util.*;
public class _872 {
}

class Solution872 {
    List<Integer> ans1 = new ArrayList();
    List<Integer> ans2 = new ArrayList();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        help(root1,ans1);
        help(root2,ans2);

        for(int i = 0; i < ans1.size(); i++){
            if(ans1.get(i)!=ans2.get(i)) return false;
        }
        return true;

    }
    public void help(TreeNode root,List<Integer> ans){


        if (root == null)return;
        if(root.left==null&&root.right==null) ans.add(root.val);
        help(root.left,ans);
        help(root.right,ans);
    }
}