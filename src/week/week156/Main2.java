package week.week156;

import java.util.Arrays;
import java.util.Map;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol=new Solution2();
        sol.equalSubstring("krpgjbjjznpzdfy",
                "nxargkbydxmsgby",
                14);
    }
}

class Solution2 {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        int[] ansList = new int[len];
        for (int i = 0; i < len; i++) {
            int x = Math.abs(s.charAt(i) - t.charAt(i));
            ansList[i] = x;
        }
        System.out.println(Arrays.toString(ansList));
        int lFlag = 0;
        int rFlag = 0;
        int maxAns=0;
        int sum=0;
        while(rFlag<len){
            sum+=ansList[rFlag];
            rFlag++;
            while(sum>maxCost){
                sum-=ansList[lFlag];
                lFlag++;
            }
            maxAns=Math.max(rFlag-lFlag,maxAns);
        }
        System.out.println(maxAns);
        return maxAns;
    }
}