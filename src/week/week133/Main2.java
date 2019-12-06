package week.week133;

import java.util.TreeMap;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.allCellsDistOrder(2,2,0,1);
    }
}

class Solution2 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        TreeMap<Integer,List<int[]>> mayres = new TreeMap<>();
        for(int i = 0 ;i < R;i++){
            for(int j = 0;j < C;j++){
                int ttt = Math.abs(i-r0)+Math.abs(j-c0);
                int[] subans = new int[]{i,j};
                if(!mayres.containsKey(ttt)){
                    List<int[]> sub = new ArrayList<>();
                    sub.add(subans);
                    mayres.put(ttt,sub);
                }
                else{
                    mayres.get(ttt).add(subans);
                    System.out.println(mayres.get(ttt));
//                    mayres.put(ttt,mayres.get(ttt).add(subans))

                }

            }

        }
        System.out.println(mayres.toString());
        int[][] res = new int[R*C][2];
        int cnt= 0;
        for(int i:mayres.keySet()){
            for(int j = 0;j<mayres.get(i).size();j++){
                res[cnt]=mayres.get(i).get(j);
                cnt++;

            }
        }
        return res;

    }
}