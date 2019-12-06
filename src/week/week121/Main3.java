package week.week121;

public class Main3 {
}


class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        for (int i : days){
            dp[i]=1;
        }
        for(int i = 1; i < 366; i++){
            if (dp[i]==0){dp[i]=dp[i-1];}
            else{
                if(i<7){
                    dp[i]=threeMin(dp[i-1]+costs[0],costs[1],costs[2]);
                }
                else if (i<30){
                    dp[i]=threeMin(dp[i-1]+costs[0],dp[i-7]+costs[1],costs[2]);
                }
                else {
                    dp[i]=threeMin(dp[i-1]+costs[0],dp[i-7]+costs[1],dp[i-30]+costs[2]);
                }

            }

        }
        return dp[days[days.length-1]];

    }
    int threeMin(int a,int b,int c){
        int min;
        if (a<b){min = a;}
        else {min = b;}
        if (c < min )return c;
        else return min;

    }
}