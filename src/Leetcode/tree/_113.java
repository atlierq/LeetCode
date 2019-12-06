package Leetcode.tree;
import java.util.*;
public class _113 {
}

class Solution113 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return ans;
        help(root,0,new ArrayList<>(),sum);

        return ans;

    }
    public void help(TreeNode root,int currentSum,List<Integer>currentList,int sum){
        if(root == null) return;
        currentSum+=root.val;
        currentList.add(root.val);
        if(root.left==null&&root.right==null){
            if(currentSum == sum)
            {
                ans.add(new ArrayList<>(currentList));
            }
            currentList.remove(currentList.size()-1);
            return;
        }

        help(root.left,currentSum,currentList,sum);
        help(root.right,currentSum,currentList,sum);
        currentList.remove(currentList.size()-1);
    }
}