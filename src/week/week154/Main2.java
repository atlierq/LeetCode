package week.week154;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol=new Solution2();
        System.out.println(sol.reverseParentheses("(abcd)"));
    }
}
class Solution2 {
    public String reverseParentheses(String ss) {
        String ans;
        StringBuilder s =new StringBuilder(ss);
        Stack<StringBuilder> left=new Stack<>();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                left.push(new StringBuilder(""));
            }
            else if(s.charAt(i)==')'){
                System.out.println(left);
                StringBuilder first=left.pop().reverse();
                if(left.empty()){left.push(first);}
                else {left.push(left.pop().append(first));}

            }
            else {
                if (left.empty()){
                    StringBuilder first=new StringBuilder(new StringBuilder("").append(s.charAt(i)));
                    System.out.println(first);
                    left.push(first);
                    System.out.println(left);
                }else{
//                    StringBuilder a=left.peek().append(s.charAt(i));
                    left.push(left.pop().append(s.charAt(i)));
                }


//                System.out.println(a);
//
            }

        }
        System.out.println(left);
        return new String(left.peek());


    }
}
