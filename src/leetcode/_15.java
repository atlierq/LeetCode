package leetcode;

import java.util.*;

public class _15 {
    public static void main(String[] args){
        Solution15 sol=new Solution15();
        sol.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
    }
}


class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
//        int i=0;
//        int j=len-1;
        Arrays.sort(nums);
//        for(int x:nums){System.out.println(x);}
        Map<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> All=new ArrayList<>();
        for(int i=0;i<len;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int sum=nums[i]+nums[j];
                if(map.containsKey(-sum)&&map.get(-sum)>j){
                    List<Integer> stn=new ArrayList<>();
                    stn.add(nums[i]);
                    stn.add(nums[j]);
                    stn.add(-sum);
                    All.add(stn);
                }

            }
        }

        System.out.println(All);
        return All;
    }
}

