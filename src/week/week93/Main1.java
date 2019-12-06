package week.week93;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
}
class Solution {
    public int binaryGap(int N) {
        String binArr = Integer.toBinaryString(N);
        int len = binArr.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if(binArr.charAt(i)=='1'){
                list.add(i);
            }
        }
        int res = 0;
        if(list.size()<2){
            return 0;
        }
        else {
            for(int i = 1; i < list.size(); i++){
                if(list.get(i)-list.get(i-1)>res){
                    res = list.get(i)-list.get(i-1);
                }
            }
        }

        return res;
    }
}