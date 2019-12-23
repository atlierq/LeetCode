package week.week166;

public class Main1 {
}

class Solution1 {
    public int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        for(char i:Integer.toString(n).toCharArray()){
            a*=(i-'0');
            b+=(i-'0');
        }
        return a-b;
    }
}