package week.week99;

public class Main1 {
}

class Solution1 {
    public int surfaceArea(int[][] grid) {
        int cnt = 0;
        int len = grid.length;
        for(int i = 0; i<len; i++){
            for(int j = 0; j < len;j++){
                if(grid[i][j]>0){cnt+=2;}
                //上面
                if(j+1==len){
                    cnt+=grid[i][j];
                }
                else {
                    if(grid[i][j]>grid[i][j+1]){
                        cnt+=grid[i][j]-grid[i][j+1];
                    }
                }
                //下面
                if(j-1<0){
                    cnt+=grid[i][j];
                }
                else {
                    if(grid[i][j]>grid[i][j-1]){
                        cnt+=grid[i][j]-grid[i][j-1];
                    }
                }

                //左面
                if(i-1<0){
                    cnt+=grid[i][j];
                }
                else {
                    if(grid[i][j]>grid[i-1][j]){
                        cnt+=grid[i][j]-grid[i-1][j];
                    }
                }

                //右面
                if(i+1==len){
                    cnt+=grid[i][j];
                }
                else {
                    if(grid[i][j]>grid[i+1][j]){
                        cnt+=grid[i][j]-grid[i+1][j];
                    }
                }
            }
        }
        return cnt;

    }
}