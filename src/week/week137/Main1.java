package week.week137;

import java.util.Arrays;
import java.util.*;
public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.lastStoneWeight(new int[]{2,7,4,1,8,1});
    }
}
class Solution1 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int i : stones){
            list.add(i);
        }

        while(list.size()>=2){
            Collections.sort(list);
            int len = list.size();
            if(list.get(len - 1).equals(list.get(len - 2))){
                list.remove(len-1);
                list.remove(len-2);
            }
            else{
                int a = list.get(len-1);
                int b = list.get(len-2);
                list.remove(len-1);
                list.remove(len-2);
                list.add(a-b);
            }
        }
        if(list.size()==1){
            return list.get(0);
        }
        else return 0;


    }
}