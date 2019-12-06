package week.week163;
import java.util.*;
public class Main1 {
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] stay = new int[m];
        for(int num=0;num<k;num++){
            for(int i = 0;i<m;i++){
                stay[i]=grid[i][n-1];
            }
            for(int i = n-2;i>=0;i--){
                for(int j = 0 ;j<m;j++){
                    grid[j][i+1]=grid[j][i];
                }
            }
            for(int i = 1;i<m;i++){
                grid[i][0]=stay[i-1];
            }
            grid[0][0]=stay[m-1];

        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<m;i++){
            List<Integer> sub = new ArrayList<>();
            for(int j =0;j<n;j++){
                sub.add(grid[i][j]);
            }
            ans.add(sub);
        }
        return ans;
    }
}
//
//    int[] stay = new int[m];
//        for(int i = 0;i<m;i++){
//        stay[i]=grid[i][n-1];
//        }
//        for(int i = n-2;i>=0;i--){
//        for(int j = 0 ;j<m;j++){
//        grid[j][i+1]=grid[j][i];
//        }
//        }
//        for(int i = 1;i<m;i++){
//        grid[i][0]=stay[i-1];
//        }
//        grid[0][0]=stay[m-1];