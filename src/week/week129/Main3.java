package week.week129;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.maxScoreSightseeingPair(new int[]{1,2});
        System.out.println(ans);
    }
}
class Solution3 {
    public int maxScoreSightseeingPair(int[] A) {
        int len = A.length;
        int[] Aplus = new int[len];
        int[] Aminus = new int[len];
        for(int i = 0; i < len; i++){
            Aplus[i] = A[i] + i;
            Aminus[i] = A[i] - i;
        }
        int[] AplusLeft = new int[len];
        int[] Aminusright = new int[len];
        int maxLeft = Integer.MIN_VALUE;
        for(int i = 0;i < len; i++){
            if (Aplus[i]>maxLeft){
                maxLeft=Aplus[i];
            }
            AplusLeft[i] = maxLeft;
        }
        System.out.println(Arrays.toString(Aminus));
        int maxRight = Integer.MIN_VALUE;
        for(int i = len-1;i>0;i--){
            if(Aminus[i]>maxRight){
                maxRight=Aminus[i];
            }
            Aminusright[i]=maxRight;
        }
        int ans = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(AplusLeft));
        System.out.println(Arrays.toString(Aminusright));
        for(int i = 0;i<len-1;i++){
            if (AplusLeft[i]+Aminusright[i+1]>ans){
                ans=AplusLeft[i]+Aminusright[i+1];
            }
        }
        return ans;

    }
}