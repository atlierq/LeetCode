package Leetcode;

public class _829 {
    public static void main(String[] args){
        Solution829 sol = new Solution829();
        int ans = sol.consecutiveNumbersSum(5);
        System.out.println(ans);
    }
}
class Solution829 {
    public int consecutiveNumbersSum(int N) {
        int ans = 1;
        for(int i = 2;i<Math.sqrt(2*N);i++){
            if (((N-i*(i-1)/2)%i)==0) ans++;
        }
        return ans;
    }
}