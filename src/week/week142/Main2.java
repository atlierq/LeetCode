package week.week142;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
}

class Solution2 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stat = new int[1001];
        for(int i = 0;i < trips.length;i++){
            for(int j = trips[i][1];j<=trips[i][2];j++){
                stat[j]+=trips[i][0];
            }
        }
        for(int i :stat){
            if(i>capacity){
                return false;
            }
        }
        return true;





    }
}