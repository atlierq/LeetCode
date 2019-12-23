package week.doubleweek15;
import java.util.*;
public class Main2 {
}

class Solution2 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]-t1[0];
            }
        });
        int start = intervals[0][1];
        int ans = intervals.length;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][1]<=start){
                ans--;
            }
            else {
                start=intervals[i][1];

            }
        }
        return ans;
    }
}
