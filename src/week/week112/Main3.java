package week.week112;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol =new Solution3();
        sol.bagOfTokensScore(new int[]{71,55,82},54);


    }

}

class Solution3 {
    public int bagOfTokensScore(int[] tokens, int P) {
        int i = 0;
        int j = tokens.length-1;
        int max = 0;
        int cnt = 0;
        Arrays.sort(tokens);
        while(i<=j){
            if (P-tokens[i]>=0){
                P-=tokens[i];
                cnt++;
                max = Math.max(max,cnt);
                i++;

            }
            else {
                if (cnt>0){
                    P+=tokens[j];
                    cnt--;}
                j--;

            }

        }
        System.out.println(max);
        return max;

    }
}