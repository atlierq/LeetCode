package Leetcode;
import java.util.*;
public class _54 {
    public static void main(String[] args){
        Solution54 sol = new Solution54();
        System.out.println(sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}


class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //m为行数，n为列数；
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] copy = new boolean[m][n];
        List<Integer> ans = new ArrayList<>();
        int x = 0;
        int y = 0;
        int zhiling = 0;
        int cnt = m * n;
        while(true){
            //y++
            while(zhiling == 0){
                if(cnt==0)return ans;
                if(copy[x][y]){
                    y--;
                    x++;
                    zhiling = 1;

                }
                else {
                    ans.add(matrix[x][y]);
                    copy[x][y]=true;
                    cnt--;
                    if(y<n-1)y++;
                    else {
                        x++;
                        zhiling=1;
                    }
                }


            }
            //x++
            while(zhiling == 1){
                if(cnt==0)return ans;
                if(copy[x][y]){
                    x--;
                    y--;
                    zhiling = 2;

                }
                else {
                    ans.add(matrix[x][y]);
                    copy[x][y]=true;
                    cnt--;
                    if(x<m-1)x++;
                    else {
                        y--;
                        zhiling=2;
                    }
                }
            }
            //y--
            while(zhiling == 2){
                if(cnt==0)return ans;
                if(copy[x][y]){
                    y++;
                    x--;
                    zhiling = 3;

                }
                else {
                    ans.add(matrix[x][y]);
                    copy[x][y]=true;
                    cnt--;
                    if(y>0)y--;
                    else {
                        x--;
                        zhiling=3;
                    }
                }
            }
            //x--
            while(zhiling == 3){
                if(cnt==0)return ans;
                if(copy[x][y]){
                    x++;
                    y++;
                    zhiling = 0;

                }
                else {
                    ans.add(matrix[x][y]);
                    copy[x][y]=true;
                    cnt--;
                    if(x>0)x--;
                    else {
                        y++;
                        zhiling=0;
                    }
                }
            }



        }

    }
}