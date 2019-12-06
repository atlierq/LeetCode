package week.week158;
import java.util.*;
public class Main2 {
}
class Solution2 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int [] num = new int[8];
        for(int i=0;i<8;i++){num[i]=10;}
        int[][] ans = new int[8][2];
        for(int i = 0; i<queens.length; i++){
            int x=queens[i][0]-king[0];
            int y=queens[i][1]-king[1];


            if (y<0&&x==0){if(Math.abs(y)<num[0]){num[0]=Math.abs(y);ans[0][0]=queens[i][0];ans[0][1]=queens[i][1];}}
            else if(y>0&&x==0){
                if(Math.abs(y)<num[1]){
                    num[1]=Math.abs(y);ans[1][0]=queens[i][0];ans[1][1]=queens[i][1];
                }
            }
            else if(x>0&&y==0){
                if(Math.abs(x)<num[2]){
                    num[2]=Math.abs(x);
                    ans[2][0]=queens[i][0];
                    ans[2][1]=queens[i][1];
                }
            }
            else if(x<0&&y==0){if(Math.abs(x)<num[3]){num[3]=Math.abs(x);ans[3][0]=queens[i][0];ans[3][1]=queens[i][1];}}
            else if(x==y&&x>0){if(Math.abs(x)<num[4]){num[4]=Math.abs(x);ans[4][0]=queens[i][0];ans[4][1]=queens[i][1];}}
            else if(x==-y&&x>0){if(Math.abs(x)<num[5]){num[5]=Math.abs(x);ans[5][0]=queens[i][0];ans[5][1]=queens[i][1];}}
            else if(x==-y&&x<0){if(Math.abs(x)<num[6]){num[6]=Math.abs(x);ans[6][0]=queens[i][0];ans[6][1]=queens[i][1];}}
            else if(x==y&&x<0){if(Math.abs(x)<num[7]){num[7]=Math.abs(x);ans[7][0]=queens[i][0];ans[7][1]=queens[i][1];}}
        }
        List<List<Integer>> trueAns=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if (num[i]<10){trueAns.add(new ArrayList<>(Arrays.asList(ans[i][0],ans[i][1])));}
        }

        return trueAns;
    }
}