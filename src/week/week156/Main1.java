package week.week156;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args){


    }

}
class Solution1 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> ans=new HashMap<>();
        for (int i:arr){
            if (!ans.containsKey(i)){
                ans.put(i,1);
            }
            else{
                ans.put(i,ans.get(i)+1);
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i:ans.values()){set.add(i);}
        return set.size()==ans.size();

    }
}