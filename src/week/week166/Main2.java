package week.week166;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.groupThePeople(new int[]{3,3,3,3,3,1,3});
    }
}

class Solution2 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<groupSizes.length;i++){
            if(map.containsKey(groupSizes[i])){
               map.get(groupSizes[i]).add(i);
            }
            else {
                map.put(groupSizes[i],new ArrayList<>());
                map.get(groupSizes[i]).add(i);
            }

        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i).size()==i){
                ans.add(map.get(i));
            }
            else {
                //长度是i的几倍
                for(int x = 0;x <map.get(i).size()/i;x++){
                    List<Integer> sub = new ArrayList<>(map.get(i).subList(x*i,(x+1)*i));
                    ans.add(sub);
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}