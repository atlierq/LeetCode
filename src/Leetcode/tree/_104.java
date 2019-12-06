package Leetcode.tree;

public class _104 {
}

class Solution104 {
    int max = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        help(root,0);
        return max;

    }
    public void help(TreeNode root,int level){


        if (level>max) max = level;
        System.out.println(max);
        if(root.left!=null){
            help(root.left,level+1);
        }
        if(root.right!=null){
            help(root.right,level+1);
        }


    }
}