package week.week104;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        sol.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"},new String[]{"ec","oc","ceo"});
    }

}
class Solution3 {
    public  List<String> wordSubsets(String[] A, String[] B) {
        Map<Character,Integer> sum = new HashMap<>();
        Map<Character,Integer> sub = new HashMap<>();
        Map<Character,Integer> Asub = new HashMap<>();
        for(String i :B){
            for(int x = 0;x<i.length();x++){
                if(!sub.containsKey(i.charAt(x))){sub.put(i.charAt(x),1);}
                else {sub.put(i.charAt(x),sub.get(i.charAt(x))+1);}
            }
            for(Character a:sub.keySet()){
                if(!sum.containsKey(a)){sum.put(a,sub.get(a));}
                else {
                    if(sub.get(a)>sum.get(a)){sum.put(a,sub.get(a));}
                }
            }
            sub.clear();
        }
//        System.out.println(sum.toString());
        List<String> ans = new ArrayList<>();

        for(String i:A){
            for(int x = 0;x<i.length();x++){
                if(!Asub.containsKey(i.charAt(x))){Asub.put(i.charAt(x),1);}
                else {Asub.put(i.charAt(x),Asub.get(i.charAt(x))+1);}
            }
            boolean test=true;
            for(Character a:sum.keySet()){
                if(!Asub.containsKey(a)){test=false;break;}
                else {if(Asub.get(a)<sum.get(a)){test=false;break;}}
            }
            if (test){ans.add(i);}
            Asub.clear();
        }
//        System.out.println(ans);
        return ans;

    }

}