package week.week119;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {
}
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] ans = new int[K][2];
        int[] list = new int[points.length];
        for(int i = 0; i < points.length; i++){
            list[i] = distance(points[i]);
        }
        Arrays.sort(list);
        int flag = list[K-1];
        int address = 0;
        for (int i = 0; i < points.length;i++){
            if (distance(points[i])<=flag){
                ans[address] = points[i];
                address++;
            }
        }
        return ans;

    }
    public int distance(int[] a){
        return (a[0]*a[0]+a[1]*a[1]);
    }

}