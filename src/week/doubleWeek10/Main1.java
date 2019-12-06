package week.doubleWeek10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {

}

class Solution1 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:arr1){
            if (map.containsKey(i)){map.put(i,map.get(i)+1);}
            else map.put(i,1);
        }
        for (int i:arr2){
            if (map.containsKey(i)){map.put(i,map.get(i)+1);}
        }
        for (int i:arr3){
            if (map.containsKey(i)&&map.get(i)==2){
                ans.add(i);
            }

        }
        return ans;
    }
}