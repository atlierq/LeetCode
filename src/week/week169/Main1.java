package week.week169;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.sumZero(4);
    }
}

class Solution1 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int start = -n/2;
        boolean flag = false;
        if(n%2==0){flag = true;}

        for(int i = 0 ;i<n;i++){
            if(flag&&start==0&&i!=0)
            {start++;}

            ans[i] = start;
            start++;
        }

        return ans;
    }
}