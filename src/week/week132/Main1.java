package week.week132;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.divisorGame(23);
    }
}
class Solution1 {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N+1];
        System.out.println(Arrays.toString(dp));
        for(int i = 1;i<N+1;i++){

            for(int x :getnum(i)){
                if (!dp[x])dp[i]=true;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[N];
    }
    public List<Integer> getnum(int a){
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=a/2;i++){
            if(a%2==0) ans.add(i);
        }
        return ans;
    }

}