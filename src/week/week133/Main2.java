package week.week133;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.allCellsDistOrder(2,3,1,2);
    }
}

class Solution2 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] matrix = new int[R][C];
        for(int i = c0;i<C;i++){
            matrix[r0][i]=i-c0;
        }
        for(int i = c0;i>=0;i--){
            matrix[r0][i]=c0-i;
        }
        for(int i = 0 ;i<C;i++)
            for(int j = 0;j<r0;j++){

            }
        System.out.println(Arrays.deepToString(matrix));
    return matrix;
    }
}