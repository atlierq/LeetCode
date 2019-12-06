package Leetcode.tree;

public class _129 {
}

class Solution129 {
    int cnt = 0;
    public int sumNumbers(TreeNode root) {

        help(root,0);
        return cnt;

    }
    public void help(TreeNode root,int up){

        if(root == null){
            return;
        }

        int mid = up*10 + root.val;
        if(root.left == null && root.right == null) cnt += mid;
        help(root.left,mid);
        help(root.right,mid);
    }
}