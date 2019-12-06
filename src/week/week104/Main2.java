package week.week104;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int ans = sol.partitionDisjoint(new int[]{1,1});
        System.out.println(ans);
    }
}

class Solution2 {
    public int partitionDisjoint(int[] A) {
        int len = A.length;
        int[] lMax = new int[len];
        int[] rMin = new int[len];
        int l = 0;
        int r = 1000001;
        for (int i = 0; i < len; i++) {
            if (A[i] > l) {
                l = A[i];

            }
            lMax[i] = l;

        }
        for (int i = len - 1; i >= 0; i--) {
            if (A[i] < r) {
                r = A[i];
            }
            rMin[i] = r;
        }
        System.out.println(Arrays.toString(lMax));
        System.out.println(Arrays.toString(rMin));
        int ans =0;
        for (int i = 0; i < len - 1; i++){
            if(lMax[i]<=rMin[i+1]) {ans=i+1;break;}
        }
        return ans;
    }
}