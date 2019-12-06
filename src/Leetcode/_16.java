package Leetcode;
import java.util.*;
public class _16 {
    public static void main(String[] args){
        Solution16 sol = new Solution16();
        sol.threeSumClosest(new int[]{-1,2,1,-4},1);
    }
}

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int flag = 0;flag < nums.length-2; flag++){
            if(flag>=1&&nums[flag]==nums[flag-1]) continue;
            for(int left = flag+1;left<nums.length-1;left++){
                if(left>=2&&nums[left]==nums[left-1]) continue;

                for(int right = flag + 2;right<nums.length;right++){
                    if(right>=2&&nums[right]==nums[right-1]) continue;
                    int sum = nums[flag]+nums[left]+nums[right];
                    if(Math.abs(sum-target)<min){
                        min = Math.abs(sum-target);
                        ans = sum;
                    }
                    if(min==0 )return target;
                    if(sum>target){
                        break;
                    }
                }
            }
        }
//        System.out.println(ans);
        return ans;

    }
}