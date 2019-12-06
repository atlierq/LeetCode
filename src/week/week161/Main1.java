package week.week161;

public class Main1 {
}


class Solution {
    public int minimumSwap(String s1, String s2) {
        int xTOy = 0;
        int yTOx = 0;
        for(int i = 0; i<s1.length();i++){
            if (s1.charAt(i)=='x'&&s2.charAt(i)=='y') xTOy++;
            else if(s1.charAt(i)=='y'&&s2.charAt(i)=='x') yTOx++;
        }
        if((xTOy+yTOx)%2!=0)return -1;
        if(xTOy%2==0)return xTOy/2+yTOx/2;
        else return xTOy/2+yTOx/2+2;

    }
}