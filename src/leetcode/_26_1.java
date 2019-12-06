package leetcode;

public class _26_1 {
    public static void main(String[] args){
        Solution26_1 sol=new Solution26_1();
        System.out.println(sol.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));

    }
}


class Solution26_1 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = 1;
        while (r < len) {
            if (nums[l] == nums[r]) {
                r++;
            } else {
                l++;
                nums[l] = nums[r];
            }

        }

    return l+1;
    }
}