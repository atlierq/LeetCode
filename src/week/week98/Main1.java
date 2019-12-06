package week.week98;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});

    }
}

class Solution1 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i: A) sumA+=i;
        for (int i: B) {
            sumB+=i;
            map.put(i,1);
        }
        int[] ans=new int[2];
        int mid=(sumA-sumB)/2;
        for(int i: A){
            if(map.containsKey(i-mid)) {ans[0]=i;ans[1]=i-mid;break;}
        }

        return ans;
    }
}