package week.week108;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol= new Solution1();
        sol.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"});
    }
}

class Solution1 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String sub : emails){
            System.out.println(handleSub(sub));
            set.add(handleSub(sub));

        }
        return set.size();

    }
    public String handleSub (String sub){
        StringBuilder test = new StringBuilder();
        String[] subs=sub.split("@");
        for (int i=0;i<subs[0].length();i++){
            if(sub.charAt(i)=='+'){break;}
            if(sub.charAt(i)=='.'){continue;}
            test.append(sub.charAt(i));
        }
        test.append('@');
        test.append(subs[1]);
        return test.toString();
    }
}