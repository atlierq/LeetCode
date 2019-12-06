package week.week96;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        sol.projectionArea(new int[][]{{1,2},{3,4}});
    }
}

class Solution1 {
    public int projectionArea(int[][] grid) {

        System.out.println(grid.length);
        int l=grid.length;
        int r=grid[0].length;
        int[] r_max=new int[r];
        for(int i=0;i<r;i++){
            int sub_r_max=0;
            for (int j=0;j<l;j++){
                if (grid[j][i]>sub_r_max){sub_r_max=grid[j][i];}

            }
            r_max[i]=sub_r_max;

        }
        int cnt=0;
        int[] l_max=new int[l];
        for(int i=0;i<l;i++){
            int sub_l_max=0;
            for (int j=0;j<r;j++){
                if(grid[i][j]>0) cnt+=1;
                if(grid[i][j]>sub_l_max){sub_l_max=grid[i][j];}
            }
            l_max[i]=sub_l_max;
        }
        for(int i:r_max){cnt+=i;}
        for(int i:l_max){cnt+=i;}
        System.out.println(cnt);
        return cnt;

    }
}