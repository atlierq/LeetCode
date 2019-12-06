package week.week108;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.minFallingPathSum(new int[][]{{35,94,-89,35,69},{-32,-50,19,-12,-65},{-6,-18,14,2,-38},{-29,68,-50,12,-98},{49,-33,-91,-44,-52}});
        System.out.println(ans);

    }
}
//[[35,94,-89,35,69],[-32,-50,19,-12,-65],[-6,-18,14,2,-38],[-29,68,-50,12,-98],[49,-33,-91,-44,-52]]

class Solution3 {
    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        if (len==1) return A[0][0];
        int[][] ans = new int[len][len];
        //把第一行先填满
        for (int i = 0; i<len; i++){
            ans[0][i]=A[0][i];
        }
        for(int i = 1; i<len; i++){
            for(int j = 0; j<len; j++){
                //最左侧一列
                if (j==0){
                    ans[i][j] = Math.min(ans[i-1][j],ans[i-1][j+1])+A[i][j];
                }
                //最右侧一列
                else if(j==len-1){
                    ans[i][j] = Math.min(ans[i-1][j],ans[i-1][j-1])+A[i][j];
                }
                //中间的
                else {
                    ans[i][j]=threeMin(ans[i-1][j],ans[i-1][j-1],ans[i-1][j+1])+A[i][j];
                }
            }
        }
        System.out.print(Arrays.deepToString(ans));
        int trueAns = Integer.MAX_VALUE;
        for(int i = 0; i<len; i++){
            if(ans[len-1][i]<trueAns) trueAns=ans[len-1][i];
        }
        return trueAns;
    }
    public int threeMin(int a, int b, int c){
        int min = Integer.MAX_VALUE;
        if (a<min) min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        return min;

    }
}