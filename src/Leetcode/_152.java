package Leetcode;

public class _152 {
    public static void main(String[] args){
        Solution152 sol = new Solution152();
        int ans = sol.maxProduct(new int[]{-2,-3,-4,-4});
        System.out.println(ans);

    }

}

class Solution152 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int imax ;
        int imin ;
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i<nums.length;i++){
            if(nums[i]>=0){
                imax = Math.max(max*nums[i],nums[i]);
                imin = Math.min(min*nums[i],nums[i]);
                max = imax;
                min = imin;
                if (res<max) res = max;

            }
            else {
                imax = Math.max(min*nums[i],nums[i]);
                imin = Math.min(max*nums[i],nums[i]);
                max = imax;
                min = imin;
                if (res<max) res = max;
            }
        }

        return res;
    }

}