package week.doubleweek16;
import week.TreeNode;

import java.util.*;
public class Main3  {
}
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public int deepestLeavesSum(TreeNode root) {
        help(root,1);
        int ans = 0;
        for(int i:list.get(list.size()-1)){
            ans+=i;
        }
        return ans;
    }
    public void help(TreeNode node,int level){
        if(node==null) return;
        if(level>list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level-1).add(node.val);
        help(node.left,level+1);
        help(node.right,level+1);

    }
}