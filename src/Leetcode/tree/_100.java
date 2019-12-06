package Leetcode.tree;

public class _100 {
    public static void main(String[] args) {

    }
}

class Solution100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        //有一个为空
        if (p == null || q == null) return false;
        //比较值
        if (p.val != q.val )return false;
        //利用与，其中只要有一个false，即返回false
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);


    }


}