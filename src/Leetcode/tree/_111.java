package Leetcode.tree;

public class _111 {
}

class Solution111 {
    int max = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        help(root,0);
        return max;

    }
    public void help(TreeNode root,int level){

        if(root == null) {
            return;
        }
        if(root.left==null&&root.right==null){
            if(level+1<max)max = level+1;
        }
//        if(level>max) max = level;
        help(root.left,level+1);
        help(root.right,level+1);
    }
}