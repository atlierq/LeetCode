package Leetcode;

public class _66 {
}

class Solution66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i>=0&&digits[i]==9){
            digits[i]=0;
            i--;
        }
        if(i==-1){
            //说明第一位爆了
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        else {
            digits[i]++;
            return digits;
        }

    }
}