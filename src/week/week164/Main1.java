package week.week164;

public class Main1 {
}

class Solution1 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int cnt = 0;
        for (int i = 1; i < points.length; i++) {
            int x = Math.abs(points[i][0]-points[i-1][0]);
            int y = Math.abs(points[i][1]-points[i-1][1]);
            cnt += Math.min(x,y);
            cnt += Math.abs(x - y);
        }
        return cnt;
    }
}