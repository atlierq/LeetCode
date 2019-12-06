package Leetcode;
import java.util.*;
public class _735 {
    public static void main(String[] args){
        Solution735 sol = new Solution735();
        sol.asteroidCollision(new int[]{-2,-2,1,-2});
    }
}

class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
//        int[] ans = new int[]{};
        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else {
                //大于零可以直接push
                if(i>0){
                    stack.push(i);
                }
                else {
                    if(stack.peek()<0){
                        stack.push(i);
                    }
                    else {
                        //stack元素为正
                        boolean exit = true;
                        while(!stack.isEmpty()&&stack.peek()>0&&exit){
                            int mid = stack.peek()+i;
                            if(mid>0){
                                //外面炸了
                                exit=false;
                            }
                            else if(mid<0){
                                //里面炸了，要考虑连续炸
                                stack.pop();
                            }
                            else {
                                stack.pop();
                                exit = false;
                            }
                        }
                        if(exit) stack.push(i);

                    }

                }

            }

        }
        System.out.println(stack.toString());
        List<Integer> noAns = new ArrayList<>();
        while(!stack.isEmpty()){noAns.add(stack.pop());}
        int[] ans = new int[noAns.size()];
        for(int i = 0;i<noAns.size();i++){
            ans[noAns.size()-i-1]=noAns.get(i);
        }
        return ans;


    }

}