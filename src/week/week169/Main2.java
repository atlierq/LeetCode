package week.week169;
import week.TreeNode;

import java.util.*;
public class Main2 {
}

class Solution2 {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        help(root1);
        help(root2);
        Collections.sort(ans);
        return ans;
    }
    public void help(TreeNode root){
        if(root == null){return;}
        ans.add(root.val);
        help(root.left);
        help(root.right);
    }
}