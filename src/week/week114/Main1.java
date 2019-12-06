package week.week114;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        boolean ans = sol.isAlienSorted(new String[]{"apple","app"},"abcdefghijklmnopqrstuvwxyz");
        System.out.println(ans);
    }
}
//["apple","app"]
//        "abcdefghijklmnopqrstuvwxyz"
class Solution1 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        int address = 0;
        for (char ch : order.toCharArray()){
            map.put(ch,address);
            address++;
        }
        for(int i = 0; i < words.length-1;i++){
            int len = Math.min(words[i].length(),words[i+1].length());
            boolean test = true;
            for(int x = 0;x <len;x++){
//                if (words[i].charAt(x)==words[i+1].charAt(x)){continue;}
                if(map.get(words[i].charAt(x))<map.get(words[i+1].charAt(x))){test=false;break;}
                else if(map.get(words[i].charAt(x))>map.get(words[i+1].charAt(x))){return false;}

            }
            if (test&&words[i+1].length()>words[i].length()) return false;

        }
        return true;

    }
}