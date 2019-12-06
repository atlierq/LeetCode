package week.week157;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.longestSubsequence(new int[]{4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8},0);
    }



}

class Solution2 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        int max=1;
        for (int i = 0; i < len; i++){
            if (map.containsKey(arr[i]-difference)){
                map.put(arr[i],map.get(arr[i]-difference)+1);
                if (map.get(arr[i])>max){max=map.get(arr[i]);}
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);


        System.out.println(max);
        return max;
    }
}