package Leetcode;

public class _53 {
    public static void main(String[] args){
        Solution53 sol = new Solution53();
        int ans = sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(ans);
    }
}

class Solution53 {
    public int maxSubArray(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
        int max = ans[0];
        for (int i = 1; i<nums.length;i++){
            ans[i]=Math.max(ans[i-1]+nums[i],nums[i]);
            if (max<ans[i]){
                max = ans[i];
            }
        }

        return max;
    }
}