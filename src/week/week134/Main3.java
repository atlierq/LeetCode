package week.week134;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        sol.maxUncrossedLines(new int[] {1,4,2},new int[]{1,2,4});

    }

}

class Solution3 {
    public int maxUncrossedLines(int[] A, int[] B) {
        int lenA=A.length+1;
        int lenB=B.length+1;
        int [][] ans=new int[lenA][lenB];
        for (int i=1;i<lenA;i++){
            for(int j=1;j<lenB;j++){
                if(A[i-1]==B[j-1]){ans[i][j]=ans[i-1][j-1]+1;}
                if(A[i-1]!=B[j-1]){ans[i][j]=Math.max(ans[i-1][j],ans[i][j-1]);}

            }
        }
        System.out.println(Arrays.deepToString(ans));
        System.out.println(ans[lenA-1][lenA-1]);

    return ans[lenA-1][lenA-1];
    }
}
