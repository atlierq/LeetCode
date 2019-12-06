package Leetcode.tree;
import java.util.*;
public class _958 {
}

class Solution958 {
    List<List<Boolean>> ans = new ArrayList<>();
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)return true;
        helper(root,1);
        for(int i=0;i<ans.size()-2;i++){
            int need = (int)Math.pow(2,i);
            for(boolean x : ans.get(i)){
                if(x){need--;}
                else return false;
            }
            if(need!=0)return false;
        }
        //最后一行
        boolean flag = true;
        for(int i = 0;i<ans.get(ans.size()-2).size();i++){
            if(!ans.get(ans.size()-2).get(i)) flag=false;
            if(!flag){
                if(ans.get(ans.size()-2).get(i))return false;
            }
        }
        return true;

    }
    public void helper(TreeNode root,int level){
        if(root == null) {
            if(ans.size()<level)ans.add(new ArrayList<>());
            ans.get(level).add(false);
            return;
        }
        if(ans.size()<level)ans.add(new ArrayList<>());
        ans.get(level).add(true);
        helper(root.left,level+1);
        helper(root.right,level+1);

    }
}