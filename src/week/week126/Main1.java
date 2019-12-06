package week.week126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.commonChars(new String[]{"bella","label","roller"});


    }

}

class Solution1 {
    public List<String> commonChars(String[] A) {
        int [][] ans = new int[A.length][26];
        for(int i = 0;i<A.length;i++){
            for(char ch : A[i].toCharArray()){
                ans[i][ch-'a']++;
            }
        }
        List<String> trueAns = new ArrayList<>();
        for(int i = 0;i<26;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<A.length;j++){
                if (ans[j][i]<min) min =ans[j][i];
            }
            for (int num = 0;num<min;num++){
                trueAns.add(String.valueOf((char)(i+'a')));
            }
        }
        System.out.println(trueAns);
    return trueAns;
    }
}