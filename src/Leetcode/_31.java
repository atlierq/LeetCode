package Leetcode;
import java.util.*;
public class _31 {


}


class Solution31 {
    public void nextPermutation(int[] nums) {
        int flag = 0;
        for(int i = nums.length - 1  ; i > 0; i--){
            if(nums[i]>nums[i-1]){
                flag = i;
                break;
            }
        }
        if (flag==0){
            Arrays.sort(nums);
        }
        else {
            int[] sub = new int[nums.length-flag];
            for(int i = flag; i < nums.length; i++){
                sub[i-flag] = nums[i];
            }
            for(int i = sub.length; i >= 0; i--){
                if(sub[i]>nums[flag-1]){
                    int mid = sub[i];
                    sub[i] = nums[flag-1];
                    nums[flag - 1] = mid;
                    break;
                }
            }
            Arrays.sort(sub);
            for(int i = flag; i < nums.length; i++){
                nums[i] = sub[i-flag];
            }
        }

    }
}