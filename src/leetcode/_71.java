package leetcode;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Stack;

public class _71 {
    public static void main(String[] args) {
        Solution71 sol = new Solution71();
        String a=sol.simplifyPath("/a/../../b/../c//.//a");
        System.out.println(a);
    }
}

class Solution71 {
    public String simplifyPath(String path) {
        String[] a = path.split("/");
        System.out.println(Arrays.toString(a));
        Stack<String> stack = new Stack<>();
        for (int i = 1; i < a.length; i++){
            switch (a[i]){
                case(""):

                case("."):
                    break;
                case(".."): {
                    if(!stack.isEmpty()){stack.pop();}
                    break;
                }
                default:stack.push(a[i]);break;

            }

        }
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        StringBuilder ans = new StringBuilder();
        if (stack.isEmpty()) ans.append("/");
        else {
            while (!stack.isEmpty()){
                ans.insert(0,stack.pop());
                ans.insert(0,"/");

            }
        }

        return ans.toString();
    }
}