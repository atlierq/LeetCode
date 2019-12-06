package week.week158;

public class Main1 {
}

class Solution {
    public int balancedStringSplit(String s) {
        if (s.length()==1) return 0;
        int cnt = 0;
        int LNum = 0;
        int RNum = 0;
        for(char ch : s.toCharArray()){
            if (ch=='L'){
                LNum++;
                if(LNum==RNum){cnt++;LNum=0;RNum=0;}
            }
            if (ch=='R'){
                RNum++;
                if(LNum==RNum){cnt++;LNum=0;RNum=0;}
            }
        }
        return cnt;
    }
}