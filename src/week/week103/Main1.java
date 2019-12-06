package week.week103;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args){
        Solution1  sol= new Solution1();
        sol.smallestRangeI(new int[] {1,3,6},3);
    }
}

class Solution1 {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];
        if ((max-min)<=2*K){return 0;}
        else return (max-min-2*K);


    }
}