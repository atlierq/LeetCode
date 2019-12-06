package leetcode;

import java.util.Arrays;

public class _63 {
    public static void main(String[] args){
        Solution63 sol=new Solution63();
        sol.uniquePathsWithObstacles(new int[][]{{0,1,0},{0,1,0},{0,0,0},{0,0,0}});

    }
}

class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        System.out.println(m+" "+n );
        int fill1=1;
        int fill2=1;
        System.out.println(Arrays.deepToString(obstacleGrid));
        if (obstacleGrid[0][0]==1){return 0;}
        else {
            for (int i=0;i<n;i++){
                if(obstacleGrid[0][i]==1){fill1=0;}
                obstacleGrid[0][i]=fill1;
            }
            for (int i=1;i<m;i++){

                if(obstacleGrid[i][0]==1){fill2=0;}
                obstacleGrid[i][0]=fill2;
            }
            System.out.println(Arrays.deepToString(obstacleGrid));
            for (int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(obstacleGrid[i][j]==1){obstacleGrid[i][j]=0;}
                    else{obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];}
                }
            }
        }
//        System.out.println(Arrays.deepToString(obstacleGrid));
        return obstacleGrid[m-1][n-1];
    }
}