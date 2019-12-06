package week.week134;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        sol.numMovesStones(1,2,5);
    }
}

class Solution1 {
    public int[] numMovesStones(int a, int b, int c) {
        int[] test=new int[]{a,b,c};
        Arrays.sort(test);
        int l=test[1]-test[0];
        int r=test[2]-test[1];
        int max=l+r-2;
        int min=0;
        if (l==1&&r==1) min=0;
        else if((l<=2&&r>=2)||(l>=2&&r<=2)) min=1;
        else min=2;


        return new int[] {min,max};

    }
}