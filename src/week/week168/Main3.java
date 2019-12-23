package week.week168;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.maxFreq("bccaabac",2,2,2);
    }
}

class Solution3 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        List<String> ansList = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            //起始位
            for(int j = maxSize;j>=minSize;j--){
                if(i+j<=s.length()){
                    int letterNum = getLetterNum(s.substring(i,i+j));
                    if (letterNum<=maxLetters){
                        for(int x = j;x>=minSize;x--){
                            ansList.add(s.substring(i,i+x));
                        }
                        break;
                    }


                }
            }
        }
        Collections.sort(ansList);
        int flag =1;
        int cnt = 1;
        int ans = 0;
        if(ansList.size()>=1){
            ans=1;
        }

        while(flag<ansList.size()){

            if(ansList.get(flag).equals(ansList.get(flag-1))){
                flag++;
                cnt++;
                if(cnt>ans){
                    ans = cnt;
                }
            }
            else {
                cnt=1;
                flag++;
            }
        }
        System.out.println(ansList.toString());
        System.out.println(ans);

        return ans;
    }
    public int getLetterNum(String s){
        int[] need = new int[26];
        int cnt = 0;
        for(char ch: s.toCharArray()){
            if(need[ch-'a']==0){
                need[ch-'a']++;
            }
        }
        for(int i :need){
            cnt+=i;
        }
        return cnt;
    }
}