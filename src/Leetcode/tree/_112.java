package Leetcode.tree;

public class _112 {

}

class Solution112 {
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        help(root,0,sum);
        return ans;

    }
    public void help(TreeNode root,int up,int a){

        if(root == null) {
            if(up==a) {
                ans = true;
            }
            return;
        }
        root.val += up;
        help(root.left,root.val,a);
        help(root.right,root.val,a);
    }
}