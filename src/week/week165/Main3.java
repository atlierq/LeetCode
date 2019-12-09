package week.week165;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}});

    }
}

class Solution3 {
    public int countSquares(int[][] matrix) {
        for (int i = matrix.length-2; i >= 0; i--){
            for (int j  = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==1){
                    matrix[i][j]+=matrix[i+1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int cnt = 0;
        int a = matrix.length;
        int b = matrix[0].length;
        for(int i = 0;i<Math.min(a,b);i++){
            for(int x = 0;x < matrix.length-i;x++){
                for(int y =0;y<matrix[0].length-i;y++){
                    //起始点确定
                    boolean flag = true;
                    for(int start = y;start<y+i+1;start++){
                        if(matrix[x][start]<i+1) {
                            flag = false;
                            break;
                        };
                    }
                    if(flag)cnt++;


                }
            }
        }
        System.out.println(cnt);
        return cnt;
    }
}