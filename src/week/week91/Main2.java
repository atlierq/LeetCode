package week.week91;
import java.util.*;
public class Main2 {
}
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> ans = new ArrayList<>();
        helper(root);
        int cnt = 1;
        List<List<Integer>> subdown = new ArrayList<>();
        help(target,1,subdown);
        if(subdown.size()>=K){
            ans.addAll(subdown.get(K-1));
        }
        TreeNode maybe = target;
        int maybeNum = maybe.val;
        while(cnt<=K){
            if(maybe.parent==null)break;
            maybe = maybe.parent;
            if(cnt==K){
                ans.add(maybe.val);
            }
            if(maybe.left.val!=maybeNum){
                List<List<Integer>> leftSub = new ArrayList<>();
                help(maybe.left,1,leftSub);
                if(leftSub.size()>=K-cnt){
                    ans.addAll(subdown.get(K-cnt-1));
                }
            }
            else {
                List<List<Integer>> rightSub = new ArrayList<>();
                help(maybe.right,1,rightSub);
                if(rightSub.size()>=K-cnt){
                    ans.addAll(subdown.get(K-cnt-1));
                }

            }
            cnt++;
        }
        return ans;

    }


    public void help(TreeNode root ,int level,List<List<Integer>> list){
        if(root == null) return;
        if(list.size()<level){
            List<Integer> sub = new ArrayList<>();
            list.add(sub);
        }
        list.get(level-1).add(root.val);
        help(root.left,level+1,list);
        help(root.right,level+1,list);
    }
    public void helper(TreeNode root){
        if(root != null){
            if(root.left!=null){
                root.left.parent = root;
                helper(root.left);
            }
            if(root.right!=null){
                root.right.parent = root;
                helper(root.right);
            }
        }

    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode parent;
      TreeNode(int x) { val = x;}
}