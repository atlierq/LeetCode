package week.week147;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol =new Solution2();
        sol.alphabetBoardPath("zdz");
    }
}


class Solution2 {
    public String alphabetBoardPath(String target) {
        int[][] sb = new int[26][2];
        String[] board = new String[]{"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        for(int i = 0; i < board.length; i++){
            for (int j = 0;j < board[i].length();j++){
                sb[board[i].charAt(j)-'a']= new int[]{i,j};
            }
        }
//        System.out.println(Arrays.deepToString(sb));
        StringBuilder mid = new StringBuilder();
        int[] start = new int[]{0,0};
        for(char i : target.toCharArray()){


            int weizhi = i-'a';

            //left是竖向的位置差
            int left = sb[weizhi][0]-start[0];
            //right是横向的位置差
            int right = sb[weizhi][1] - start[1];
            if(i=='z'){
                if(right>0){
                    for(int x =0;x<right;x++){
                        mid.append("R");
                    }
                }
                else if(right<0){
                    for(int x =0;x<-right;x++){
                        mid.append("L");
                    }

                }
                if(left>0){
                    for(int x =0;x<left;x++){
                        mid.append("D");
                    }
                }
                else if(left<0){
                    for(int x =0;x<-left;x++){
                        mid.append("U");
                    }

                }
                mid.append("!");
                start = sb[weizhi];


            }
            else {
                if(left>0){
                    for(int x =0;x<left;x++){
                        mid.append("D");
                    }
                }
                else if(left<0){
                    for(int x =0;x<-left;x++){
                        mid.append("U");
                    }

                }
                if(right>0){
                    for(int x =0;x<right;x++){
                        mid.append("R");
                    }
                }
                else if(right<0){
                    for(int x =0;x<-right;x++){
                        mid.append("L");
                    }

                }
                mid.append("!");
                start = sb[weizhi];

            }
//            System.out.println(left);

//            System.out.println(mid);

        }
        return new String(mid);
    }
}