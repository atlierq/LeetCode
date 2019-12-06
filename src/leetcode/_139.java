package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class _139 {
    public static void main(String[] args) {
        Solution139 sol = new Solution139();
        List<String> input = new ArrayList<>(Arrays.asList("a"));
        sol.wordBreak("a", input);
    }

}

class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
//        Map<String, Boolean> map = new HashMap<>();
//        for (String i : wordDict) {
//            map.put(i, true);
//        }
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <=i; j++) {
                if(dp[j]&&wordDict.contains(s.subSequence(j,i+1))){dp[i+1]=true;}
            }

        }

        System.out.println(Arrays.toString(dp));
        return dp[len];

    }
}