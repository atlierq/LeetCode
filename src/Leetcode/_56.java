package Leetcode;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class _56 {
    public static void main(String[] args){
        Solution56 sol = new Solution56();
        int[][] ans = sol.merge(new int[][]{{1,3},{8,10},{2,6},{15,18}});
        System.out.println(Arrays.deepToString(ans));

    }
}
class Solution56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2)return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return Integer.compare(ints[0],t1[0]);
            }
        });
        List<int[]> ans = new ArrayList<>();
        // System.out.println(Arrays.deepToString(intervals));
        int flag = 0;
        int right = 1;
        int[] sub = intervals[0];
        while(right<intervals.length){
            if(intervals[right][0]>sub[1]){
                ans.add(sub);
                sub = intervals[right];
//                right++;
            }
            else if(intervals[right][0]<=sub[1]&&intervals[right][1]>sub[1]){
                sub[1]=intervals[right][1];
//                right++;
            }
            right++;
            if(right==intervals.length){
                ans.add(sub);
            }
        }
        int[][] res = new int[ans.size()][2];
        for(int i = 0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;


    }

}