package week.week164;

public class Main2 {
}

class Solution2 {
    public int countServers(int[][] grid) {
        int[] mGrid = new int[grid.length];//横向
        int[] nGrid = new int[grid[0].length];//竖向
        int all = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                mGrid[i]+=grid[i][j];
                nGrid[j]+=grid[i][j];
                all+=grid[i][j];

            }
        }

        int cnt = 0;
        for(int i = 0;i < grid.length;i++){
            if(mGrid[i] == 1){
                for(int j = 0; j < grid[0].length; j++){
                    if(grid[i][j]==1&&nGrid[j]==1){
                        cnt++;
                    }
                }
            }
        }
        return all - cnt;

    }
}