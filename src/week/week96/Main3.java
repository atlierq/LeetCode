package week.week96;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        sol.decodeAtIndex("leet2code3rsa",10);
    }
}
class Solution3 {
    public String decodeAtIndex(String S, int K) {
        List<String> stringList=new ArrayList<>();
        StringBuilder charString=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if (!Character.isDigit(S.charAt(i))){
                charString.append(S.charAt(i));
                if(i==S.length()-1){stringList.add(charString.toString());}
            }

            else {
//                System.out.println(charString.toString());
                stringList.add(charString.toString());
                charString.delete(0,charString.length());

//                CharList.add('a');

            }

        }
        System.out.println(stringList);
        return "ss";


    }
}