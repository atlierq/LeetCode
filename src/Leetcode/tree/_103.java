package Leetcode.tree;
import java.util.*;
public class _103 {
}

class Solution103 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)return ans;
        help(root,0);
        for(int i = 0; i<ans.size();i++){
            if(i%2!=0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
    public void help(TreeNode node,int level){

        if(node == null) return;
        if(ans.size()<=level){
            List<Integer> sub = new ArrayList<>();
            ans.add(sub);
        }
        ans.get(level).add(node.val);
        help(node.left,level+1);
        help(node.right,level+1);

    }

}