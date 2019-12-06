package week.week106;
import java.util.*;
public class Main2 {
}

class Solution2 {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (char ch : S.toCharArray()){
            if (ch=='('){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){cnt++;}
                else {
                    stack.pop();

                }
            }
        }
        cnt +=stack.size();
        return cnt;

    }
}