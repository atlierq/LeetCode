package week.week107;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol =new Solution2();
        int ans = sol.minFlipsMonoIncr("00011000");
        System.out.println(ans);
    }
}

class Solution2 {
    public int minFlipsMonoIncr(String S) {
        char[] SList = S.toCharArray();
        int len =S.length();
        int[] left=new int[len];
        int[] right = new int[len];
        int lCnt = 0;
        int rCnt = 0;
        for(int i =0;i<len ;i++){
            if (SList[i]=='1'){
                lCnt++;
            }
            left[i]=lCnt;
        }
        for(int i = len-1;i>=0;i--){
            if(SList[i]=='0'){
                rCnt++;
            }
            right[i]=rCnt;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int ans = Integer.MAX_VALUE;
        int aaa=0;
        for(int i = 0; i <len ;i++){
            aaa=left[i]+right[i];
            if (aaa<ans){ans=aaa;}
        }
    return ans-1;
    }
}