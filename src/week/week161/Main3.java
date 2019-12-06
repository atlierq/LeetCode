package week.week161;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        String ans = sol.minRemoveToMakeValid("(a(b(b(c)d)");
        System.out.println(ans);
    }
}

class Solution3 {
    public String minRemoveToMakeValid(String s) {
        Stack<combine> stack = new Stack<>();
        List<Integer> remove = new ArrayList<>();
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(new combine(i,'('));

            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    remove.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            remove.add(stack.pop().i);
        }
        StringBuilder ans = new StringBuilder(s);
        for(int i:remove){
            ans.replace(i,i+1," ");
        }
        System.out.println(ans);
        return ans.toString().replace(" ","");

    }

}

class combine{
    int i;
    char test;
    combine(int i,char test){
        this.i = i;
        this.test = test;
    }
}