package week.week108;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int ans = sol.numSubarraysWithSum(new int[]{0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0},3);
        System.out.println(ans);

//[0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0]
//

    }
}

class Solution2 {
    public int numSubarraysWithSum(int[] A, int S) {
        int ALen = A.length;
        int[] left = new int[ALen];
        int[] right = new int[ALen];
        int leftCnt = 0;
        int rightCnt = 0;
        int oneCnt = 0;
        int ans = 0;
        for(int i = 0; i < ALen; i++){
            if (A[i]==1){
                left[i]=leftCnt;
                leftCnt=0;
                oneCnt++;
            }
            else{
                leftCnt++;
            }
        }
        int[] oneaddress =new int[oneCnt];
        int oneaddressCnt = 0;
        for(int i = ALen-1; i >= 0; i--){
            if(A[i] == 1){

                right[i] = rightCnt;
                rightCnt = 0;
            }
            else rightCnt++;
        }
        for(int i = 0;i<ALen;i++){
            if(A[i]==1){
                oneaddress[oneaddressCnt]=i;
                oneaddressCnt++;
            }
        }
        System.out.println(Arrays.toString(oneaddress));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        if(S==0){

            for(int i :left){ans+=getAdd(i);}
            int lastZer0=0;
            for(int i = ALen-1;i>=0;i--){
                if (A[i]==0) lastZer0++;
                else break;
            }
            return ans+getAdd(lastZer0);

        }
        else {
            if (S>oneCnt) return 0;
            //1的数量够
            else {
                for(int i = 0;i<=oneCnt-S;i++){
                    System.out.println(i+""+(i+S-1));
                    //oneAdress i,i+S-1
                    int subans=0;
                    int leftnum=left[oneaddress[i]];
                    int rightnum = right[oneaddress[i+S-1]];
                    if(leftnum==0||rightnum==0){ans+=Math.max(leftnum,rightnum)+1;}
                    else {
                        ans+=(leftnum+1)*(rightnum+1);
                    }
                }

            }
        }
        return ans;

    }
    public int getAdd(int a){
        return (1+a)*a/2;
    }

}