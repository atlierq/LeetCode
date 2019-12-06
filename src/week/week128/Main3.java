package week.week128;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.shipWithinDays(new int[]{1,2,3,1,1},4);
    }
}
//[1,2,3,4,5,6,7,8,9,10]
class Solution3 {
    public int shipWithinDays(int[] weights, int D) {
        int max = 0;
        int sum = Integer.MAX_VALUE;
        // for (int i = 0 ; i < weights.length;i++){
        //     if (weights[i]>max) max=weights[i];
        //     sum+=weights[i];
        // }
        //最小值为max, 上限为sum;
        boolean ans= canShip(weights,D,2);
        System.out.println(ans);
        while(max<sum){
            System.out.println(max+"----"+sum);
            int maybe1 = (max+sum)/2;
            if(canShip(weights,D,maybe1)){
                sum=maybe1;
            }
            else {max=maybe1+1;}
        }
        System.out.println(max+"----"+sum);
        return max;
    }
    public boolean canShip(int[] weight, int D, int maybe){
        int cnt = 0;
        int day = 0;
        for(int i = 0; i<weight.length;i++){
            cnt+=weight[i];
            if(weight[i]>maybe)return false;
            if(cnt>maybe){
                day++;
                cnt=weight[i];
                if(day==D) return false;
            }
        }
        return true;

    }
}