package week.week133;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.maxSumTwoNoOverlap(new int[]{3,8,1,3,2,1,8,9,0},3,2);
        System.out.println(ans);

    }
}


class Solution3 {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int len = A.length;
        int[] Ladd = new int[len];
        int[] Madd = new int[len];
        for(int x = 0 ;x<L;x++){
            Ladd[0]+=A[x];
        }
        for(int y = 0 ;y<M;y++){
            Madd[0]+=A[y];
        }
        for (int i = 1;i<=len-L;i++){
            Ladd[i] = Ladd[i-1]-A[i-1]+A[i+L-1];
        }
        for (int j = 1;j<=len-M;j++){
            Madd[j] = Madd[j-1]-A[j-1]+A[j+M-1];
        }
        System.out.println(Arrays.toString(Ladd));
        System.out.println(Arrays.toString(Madd));
        int res = 0;
        for(int i = 0;i<=len-L;i++){
            //istart = i;
            int iend = i + L- 1;
            for(int j = 0;j<=len-M;j++){
                //jstart = j;
                int jend = j + M - 1;
                if(i>jend||j>iend){
                    if(res<Ladd[i]+Madd[j]){
                        res=Ladd[i]+Madd[j];
                    }
                }
            }
        }
        return res;
    }
}