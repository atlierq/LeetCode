package Leetcode.tree;
import java.util.*;
public class _235 {
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        help(root);
        List<TreeNode> left = new ArrayList<>();
        List<TreeNode> right = new ArrayList<>();
        while(p!=null){
            left.add(p);
            p = p.parent;

        }
        while(q!=null) {
            right.add(q);
            q = q.parent;
        }
        int i = left.size()-1;
        int j = right.size()-1;
        while(i>=0&&j>=0&&left.get(i).equals(right.get(j))){
            i--;
            j--;
        }
        if(i==0){
            return left.get(0);
        }
        else if(j==0){
            return right.get(0);
        }
        else {
            return right.get(i+1);
        }


    }
    public void help(TreeNode root){
        if(root != null){
            if(root.left!=null){
                help(root.left);
                root.left.parent = root;
            }
            if(root.right!=null){
                help(root.right);
                root.right.parent = root;

            }
        }
    }
}


