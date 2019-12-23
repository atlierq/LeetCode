package week.week100;
import java.util.*;
public class Main2 {
}

class Solution {

    List<Integer> list =new  ArrayList<>();
    int i = 0;
    TreeNode ans ;
    public TreeNode increasingBST(TreeNode root) {

        help(root);
        ans = new TreeNode(list.get(0));
        create(list,ans);
        return ans;
    }
    public void create(List<Integer> list,TreeNode ans ){
        if(ans==null)return;
        i++;
        if(i<list.size()){
            ans.right=new TreeNode(list.get(i));
            create(list,ans.right);
        }

    }
    public void help(TreeNode node){
        if(node==null)return;
        help(node.left);
        list.add(node.val);
        help(node.right);
    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }