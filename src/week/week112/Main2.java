package week.week112;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1});
    }
}

class Solution2 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushFlag = 0;
        int popFalg = 0;
        Stack<Integer> stack = new Stack<>();
        for (int value : pushed) {
            stack.push(value);
            while (!stack.isEmpty()&&stack.peek() == popped[popFalg]) {
                stack.pop();
                popFalg++;
            }
//            stack.push(value);
        }
        System.out.println(stack.toString());
        return stack.isEmpty();

    }
}