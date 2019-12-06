package week.week107;

import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        boolean ans = sol.isLongPressedName("pyplrz", "ppyypllr");
        System.out.println(ans);
    }
}

class Solution1 {
    public boolean isLongPressedName(String name, String typed) {
       char[] nameList = name.toCharArray();
       char[] typedList = typed.toCharArray();
       int i = 0;
       int j = 0;
       int iCnt=1;
       int jCnt =0 ;
       while(i<nameList.length){
           if (j>=typedList.length)return false;
           char flag= nameList[i];
           while(i<nameList.length-1&&nameList[i+1]==flag){
               i++;
               iCnt++;
           }
           i++;
           if (typedList[j]!=flag){return false;}
           while (j<typedList.length&&typedList[j]==flag){
               j++;
               jCnt++;
           }
           if (iCnt<=jCnt){iCnt=1;jCnt=0;}
           else return false;
       }
        return true;

    }
}