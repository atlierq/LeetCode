package week.week121;

import java.util.*;

public class Main2 {
}
class TimeMap {
    Map<String, TreeMap<Integer,String>> map;
    Map<String,TreeSet<Integer>> map2;
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
        map2 = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer,String> test = map.get(key);
            test.put(timestamp,value);
            map.put(key,test);
            map2.get(key).add(timestamp);

        }
        else{
            TreeMap<Integer,String> test = new TreeMap<>();
            test.put(timestamp,value);
            map.put(key,test);
            map2.put(key,new TreeSet<>());
            map2.get(key).add(timestamp);
        }




    }

    public String get(String key, int timestamp) {

        Integer a = map2.get(key).floor(timestamp);
        return map.get(key).getOrDefault(a, "");

    }
}

