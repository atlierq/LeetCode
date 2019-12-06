package week.week126;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.isValid("cababc");
    }
}
class Solution2 {
    public boolean isValid(String S) {
        Stack<String> ans = new Stack<>();
        for(char ch: S.toCharArray()){
            if (ch=='a'){ans.push(String.valueOf(ch));}
            else if(ch=='b'){
                if(ans.isEmpty())return false;
                else {
                    if(!ans.pop().equals("a"))return false;
                    else ans.push("ab");
                }
            }
            else{
                if(ans.isEmpty())return false;
                else {
                    if(!ans.pop().equals("ab"))return false;
                }
            }

        }
        if(ans.isEmpty())return true;
        else return false;
    }
}