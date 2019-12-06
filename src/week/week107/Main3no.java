package week.week107;

public class Main3no {
}
class Solution {
    public int[] threeEqualParts(int[] A) {
        int cnt = 0;
        int zeroCnt =0 ;
        int len = A.length;
        int[] ans =new int[2];
        for (int i :A ){
            if (i==1){
                cnt++;
            }
        }
        if (cnt%3!=0) return new int[]{-1,-1};
        for(int i=len-1;i>=0;i--){
            if (A[i]==0){zeroCnt++;}
            else break;
        }
        int oneCnt=0;
        for (int i = 0;i<len;i++){
            if (A[i]==1) oneCnt++;
            if (oneCnt==cnt/3) {



            }

        }
        return ans;
    }
}