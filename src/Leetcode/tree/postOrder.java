package Leetcode.tree;
import java.util.*;
public class postOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return res;
    }
    private void help(TreeNode root,List<Integer> res){
        if(root==null) return;
        help(root.left,res);
        help(root.right,res);
        res.add(root.val);

    }

}
