package leetcode;

import java.util.*;

public class _15_1 {
    public static void main(String[] args){
        Solution15_1 sol=new Solution15_1();
        sol.threeSum(new int[] {0,0,0,0});
    }
}


class Solution15_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int len=nums.length;
        Arrays.sort(nums);
        for (int i=0;i<len;i++){
            if(i>0){if (nums[i]==nums[i-1]) continue;}

            int start=nums[i];
            int l=i+1;
            int r=len-1;
            while(l<r){
                int sum=start+nums[l]+nums[r];
                if(sum>0){
                    r--;
                    while(nums[r]==nums[r+1]&&r>0){r--;}
                }
                else if(sum<0){
                    l++;
                    while(nums[l]==nums[l-1]&&l<len-1){l++;}

                }
                else {
                    ans.add(new ArrayList<>(Arrays.asList(start,nums[l],nums[r])));
                    l++;
                    while(nums[l]==nums[l-1]&&l<len-1){l++;}
                }
            }

        }
        System.out.println(ans);
        return ans;
    }
}
