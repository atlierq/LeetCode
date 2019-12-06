package leetcode;

public class _26 {
    public static void main(String[] args){
        Solution26 sol=new Solution26();
        System.out.println(sol.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));

    }


}

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int start=0;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[start]){
                start+=1;
                nums[start]=nums[i];

            }
        }
        for(int i:nums){System.out.println(i);}



    return start;
    }
}