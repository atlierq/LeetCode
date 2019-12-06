package week.week137;

public class Main2 {
}

class Solution2 {
    public String removeDuplicates(String S) {
        StringBuilder stringBuilder = new StringBuilder(S);
        while(true){
            if(stringBuilder.length()==0)return "";
            if(stringBuilder.length()==1)return stringBuilder.toString();
            for(int i = 0;i<stringBuilder.length()-1;i++){
                if(stringBuilder.charAt(i)==stringBuilder.charAt(i+1)){
                    stringBuilder.delete(i,i+2);
                    break;
                }
                if(i==stringBuilder.length()-2)return stringBuilder.toString();
            }
        }


    }
}