package week.week112;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.minIncrementForUnique(new int[]{3,2,1,2,1,7});
    }
}

class Solution1 {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int cnt = 0;
        for(int i = 1; i < len; i++){
            if(A[i]>A[i-1]) continue;
            else {
                cnt+=A[i-1]+1-A[i];
                A[i] = A[i-1]+1;
            }
        }
        return cnt;

    }
}