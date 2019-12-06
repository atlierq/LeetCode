package Leetcode;

public class _1014 {
}

class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int leftMax = A[0];
        int res = 0;
        for (int i = 1;i < A.length;i++){
            res = Math.max(res,leftMax+A[i]-i);
            if(A[i]+i>leftMax){
                leftMax = A[i]+i;
            }
        }
        return res;

    }
}