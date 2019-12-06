package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20 {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        boolean a = sol.isValid("]");
        System.out.println(a);

    }
}


class Solution20 {
    public boolean isValid(String s) {
        int len = s.length();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsValue(c)) {
                stack.push(c);
            } else {
                //考虑到第一个字符就是右括号的情况
                if (!stack.isEmpty()){
                    if (map.get(c).equals(stack.peek())) {
                        stack.pop();
                    } else return false;
                }
                else return false;

            }

        }
        return stack.isEmpty();

    }
}
