package week.doubleweek13;
import java.util.*;
public class Main2 {
}

class Solution2 {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        Map<String,String> test = new HashMap<>();
        for(int i = 0;i<regions.size();i++){
            for(int j = 1;j<regions.get(i).size();j++){
                test.put(regions.get(i).get(j),regions.get(i).get(0));
            }
        }
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(region1);
        list2.add(region2);
        while(test.containsKey(region1)){
            list1.add(test.get(region1));
            region1=test.get(region1);
        }
        while(test.containsKey(region2)){
            list2.add(test.get(region2));
            region2=test.get(region2);
        }
        String[] ans = new String[1];
        a:for(int i = 0;i<list1.size();i++){
            for(int j = 0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    ans[0] = list1.get(i);
                    break a;
                }
            }
        }
        return ans[0];


    }
}