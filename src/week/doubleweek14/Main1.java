package week.doubleweek14;

public class Main1 {
}

class Solution1 {
    public String toHexspeak(String num) {
        String ans = Integer.toHexString(Integer.parseInt(num));
        StringBuilder trueAns = new StringBuilder(ans);
        for(int i = 0;i<trueAns.length();i++){
            if((trueAns.charAt(i)-'2')<8&&(trueAns.charAt(i)-'2')>=0){
                return "ERROR";
            }
            if(trueAns.charAt(i)=='1'){
                trueAns.replace(i,i+1,"I");
            }
            if (trueAns.charAt(i)=='0'){
                trueAns.replace(i,i+1,"O");
            }
        }
        return trueAns.toString();

    }
}