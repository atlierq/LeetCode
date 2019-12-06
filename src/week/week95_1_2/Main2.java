package week.week95_1_2;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol=new Solution2();

    }
}

class Solution2 {
    public boolean stoneGame(int[] piles) {
        int len=piles.length;
        int l=0;
        int r=len-1;
        int alex_cnt=0;
        int lee_cnt=0;
        while(l<r){
            if(piles[l]<=piles[r]){
                alex_cnt+=piles[r];
            }
            else alex_cnt+=piles[l];

        }


        return false;
    }
}