package Leetcode;

import java.util.Arrays;

public class _59 {
    public static void main(String[] args){
        Solution59 sol = new Solution59();
        sol.generateMatrix(5);

    }
}

class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int cnt=1;
        for(int i = 0; i < n; i++){
            ans[0][i]=cnt;
            cnt++;
        }
        int x = 0;
        int y = n-1;
        for (int i = n-1; i >= 1; i--){

        }
        System.out.println(Arrays.deepToString(ans));

        return ans;

    }
}