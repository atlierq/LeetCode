package Leetcode;

import java.util.Arrays;

public class _238 {
    public static void main(String[] args){
        Solution238 sol = new Solution238();
        sol.productExceptSelf(new int[]{1,2,3,4});
    }
}
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = nums[0];
        right[len-1] = nums[len-1];
        for (int i = 1;i<len;i++){
            left[i]=left[i-1]*nums[i];
            right[len-i-1]=right[len-i]*nums[len-i-1];
        }
//        System.out.println(Arrays.toString(right));
        int[] ans = new int[len];
        ans[0] = right[1];
        ans[len-1] = left[len-2];
        for (int i = 1 ;i<len-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
//        System.out.println(Arrays.toString(ans));
        return ans;

    }
}