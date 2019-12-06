package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _59 {
    public static void main(String[] args){
        Solution59 sol = new Solution59();
        sol.generateMatrix(4);
    }
}

class Solution59 {

    public int[][] generateMatrix(int n) {
        //m为行数，n为列数；n
        int[][] copy = new int[n][n];
//        List<Integer> ans = new ArrayList<>();
        int x = 0;
        int y = 0;
        int zhiling = 0;
        int cnt = 1;
        while(true){
            //y++
            while(zhiling == 0){
                if(cnt>n*n)return copy;
                if(copy[x][y]!=0){
                    y--;
                    x++;
                    zhiling = 1;

                }
                else {
                    copy[x][y]=cnt;
                    cnt++;
                    if(y<n-1)y++;
                    else {
                        x++;
                        zhiling=1;
                    }
                }


            }
            //x++
            while(zhiling == 1){
                if(cnt>n*n)return copy;
                if(copy[x][y]!=0){
                    x--;
                    y--;
                    zhiling = 2;

                }
                else {
                    copy[x][y]=cnt;
                    cnt++;
                    if(x<n-1)x++;
                    else {
                        y--;
                        zhiling=2;
                    }
                }
            }
            //y--
            while(zhiling == 2){
                if(cnt>n*n)return copy;
                if(copy[x][y]!=0){
                    y++;
                    x--;
                    zhiling = 3;

                }
                else {

                    copy[x][y]=cnt;
                    cnt++;
                    if(y>0)y--;
                    else {
                        x--;
                        zhiling=3;
                    }
                }
            }
            //x--
            while(zhiling == 3){
                if(cnt>n*n)return copy;
                if(copy[x][y]!=0){
                    x++;
                    y++;
                    zhiling = 0;

                }
                else {
                    copy[x][y]=cnt;
                    cnt++;
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