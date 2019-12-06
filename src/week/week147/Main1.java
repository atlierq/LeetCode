package week.week147;

public class Main1 {
}

class Solution1 {
    public int tribonacci(int n) {
        if (n == 0)return 0;
        if (n == 1)return 1;
        if (n == 2)return 1;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        res[3] = 2;
        for(int i = 4; i < n+1; i++){
            res[i] = 2*res[i-1] - res[i-4];
        }
        return res[n];


    }
}