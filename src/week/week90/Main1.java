package week.week90;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        boolean a=sol.buddyStrings("abcaa","abcbb");
        System.out.println(a);
    }
}

class Solution1 {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        int cnt=0;
        boolean test=false;
        boolean cnt_test=false;
        List<Character> test_list=new ArrayList<>();
        List<Integer> cnt_list=new ArrayList<>();
        for (int i=0;i<A.length();i++){
            if (A.charAt(i)!=B.charAt(i)){
                cnt_list.add(i);
                cnt+=1;
                if(cnt>2) return false;

            }
            if (!test){
                if (!test_list.contains(A.charAt(i))){test_list.add(A.charAt(i));}
                else test=true;
            }

        }

//        if ((A.charAt(cnt_list.get(0))==B.charAt(cnt_list.get(1)))&&(A.charAt(cnt_list.get(1))==B.charAt(cnt_list.get(0)))){
//            cnt_test=true;
//        }
        return cnt == 2&&(A.charAt(cnt_list.get(0))==B.charAt(cnt_list.get(1)))&&(A.charAt(cnt_list.get(1))==B.charAt(cnt_list.get(0))) || (cnt == 0 && test);

    }
}

