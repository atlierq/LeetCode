package week.week163;
import java.util.*;
public class Main2 {
}

class FindElements {
    Map<Integer,Integer> map = new HashMap<>();
    public FindElements(TreeNode root) {
        help(root,0);


    }

    public boolean find(int target) {
        return map.containsKey(target);

    }
    public void help(TreeNode root,int value){
        if(root == null) return;
        root.val=value;
        map.put(value,1);
        help(root.left,root.val*2+1);
        help(root.right,root.val*2+2);
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }