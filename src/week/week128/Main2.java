package week.week128;

public class Main2 {
}

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] ans = new int[60];
        for (int i = 0; i < time.length; i++){
            ans[time[i]%60]++;
        }
        int sum = 0;
        for (int i = 1 ;i<=29 ;i++){
            sum += ans[i]*ans[60-i];
        }
        if(ans[0]>=1){sum+=ans[0]*(ans[0]-1)/2;}
        if(ans[30]>=1){sum+=ans[30]*(ans[30]-1)/2;}

        return sum;
    }
}