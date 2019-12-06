package Leetcode.tree;
import java.util.*;


class inOrder{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        help(root,res);
        return res;


    }
    private void help(TreeNode root,List<Integer> res){
        if(root != null){
            if(root.left != null){
                help(root.left,res);
            }
            res.add(root.val);
            if(root.right != null){
                help(root.right,res);
            }
        }

    }
}



