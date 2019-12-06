package Leetcode;

import java.util.Arrays;

public class _198 {
    public static void main(String[] args){
        Solution198 sol=new Solution198();
        sol.rob(new int[] {1,1});
    }
}

class Solution198 {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        else if (len==1) return nums[0];
        else if (len==2) return Math.max(nums[0],nums[1]);
        else {
            int[] ans=new int[nums.length];
            ans[0]=nums[0];
            ans[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++){
                ans[i]=Math.max(ans[i-1],ans[i-2]+nums[i]);
            }
            System.out.println(Arrays.toString(ans));
            return ans[nums.length-1];
        }


    }
}