package week.week133;
import java.util.*;
public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        int ans = sol.twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}});
        System.out.println(ans);
    }
}


class Solution1 {
    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        combine[] ans = new combine[costs.length];
        for (int i = 0;i< costs.length;i++){
            ans[i] = new combine(costs[i][1]-costs[i][0],i);
        }
        Arrays.sort(ans, new Comparator<combine>() {
            @Override
            public int compare(combine o1, combine o2) {
                return Integer.compare(o1.chazhi, o2.chazhi);
            }
        });
        int res = 0;
        int cnt = 0;
        for(int i =0;i<len;i++){
            if(cnt<len/2){
                res+=costs[ans[i].weizhi][1];
                cnt++;
            }
            else{
                res+=costs[ans[i].weizhi][0];
            }
        }
        return res;
    }

}
class combine{
    int chazhi;
    int weizhi;
    combine(int chazhi,int weizhi){
        this.chazhi = chazhi;
        this.weizhi = weizhi;
    }
}