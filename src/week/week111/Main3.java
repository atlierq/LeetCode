package week.week111;

import javax.swing.plaf.SliderUI;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.diStringMatch("IDID");
    }
}

class Solution3 {
    public int[] diStringMatch(String S) {
        char[] SList = S.toCharArray();
        int Rcnt = S.length();
        int len = Rcnt;
        int Icnt =0;
        int[] ans = new int[len+1];
        for(int i = 0;i<len;i++){
            if(SList[i]=='I'){ans[i]=Icnt;Icnt++;}
        }
        for(int i = 0; i<len; i++){

            if(SList[i]=='D'){ans[i]=Rcnt;Rcnt--;}
        }
        ans[len]=Icnt;
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}