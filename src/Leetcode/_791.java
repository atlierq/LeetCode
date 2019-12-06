package Leetcode;

public class _791 {
    public static void main(String[] args){
        Solution791 sol = new Solution791();
        sol.numJewelsInStones("as","assd");

    }
}

class Solution791 {
    public int numJewelsInStones(String J, String S) {
        int[] list = new int[58];
        for (char ch:S.toCharArray()){
            list[ch-'A']++;

        }
        int cnt = 0;
        for(char ch : J.toCharArray()){
            cnt+=list[ch-'A'];
        }
        return cnt;
    }
}