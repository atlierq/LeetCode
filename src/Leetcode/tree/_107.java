package Leetcode.tree;
import java.util.*;
public class _107 {
}

class Solution107 {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return ans;
        help(root,1);
        Collections.reverse(ans);
        return ans;


    }
    public void help(TreeNode node,int level){
        if(node == null) return;
        if(ans.size()<level){
            List<Integer> sub = new ArrayList();
            ans.add(sub);
        }
        ans.get(level-1).add(node.val);
        help(node.left,level+1);
        help(node.right,level+1);
    }
}