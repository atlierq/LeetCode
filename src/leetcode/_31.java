package leetcode;

public class _31 {
    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        sol.nextPermutation(new int[]{1, 2, 3});
    }
}

class Solution31 {
    public void nextPermutation(int[] nums) {

        int len=nums.length;
        for (int i = len-1; i >=0 ; i--)
        {
            for(int j =i-1;j>=0;j--)
            {
                int stn=0;
                if (nums[j]<nums[i]){
                    stn=nums[j];
                    nums[j]=nums[i];
                    nums[i]=stn;
                    for (int x:nums){System.out.println(x);}
                    return;
                }
            }
        }

    }
}