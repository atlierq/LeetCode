package week.week91;

public class Main3 {
}
class Solution3 {
    public int matrixScore(int[][] A) {
        int a = A.length;
        int b = A[0].length;
        for(int i = 0; i < a; i++){
            if (A[i][0]==0){
                flipA(A[i]);
            }
        }
        int res = 0;
        for (int j = 0; j < b; j++){
            int cnt = 0;
            for(int i = 0; i < a;i++){
                if(A[i][j]==1){
                    cnt++;
                }
            }
            res+=Math.max(cnt,a-cnt)*Math.pow(2,b-j-1);
        }
        return res;

    }
    public void flipA(int[] A){
        for(int i = 0; i < A.length; i++){
            if(A[i]==0){
                A[i]=1;
            }
            else A[i]=0;
        }
    }
}