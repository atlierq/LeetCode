package Leetcode;
import java.util.*;
public class _120 {
}

class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = triangle.size();
        ans.add(triangle.get(0));
        for (int i = 1;i<len;i++){
            List<Integer> subAns = new ArrayList<>();
            int subLen = triangle.get(i).size();
            for(int j = 0; j<subLen;j++){
                if (j == 0){
                    subAns.add(ans.get(i-1).get(0)+triangle.get(i).get(j));
                }
                else if(j == subLen-1){
                    subAns.add(ans.get(i-1).get(subLen-2)+triangle.get(i).get(j));
                }
                else {
                    subAns.add(Math.min(ans.get(i-1).get(j-1),ans.get(i-1).get(j))+triangle.get(i).get(j));
                }
            }
            ans.add(subAns);
        }
        return getMin(ans.get(len-1));

    }
    public int getMin(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }
}