package week.doubleweek16;
import java.util.*;
public class Main4 {
    public static void main(String[] args){
        Solution4 sol = new Solution4();
        List<String> need = new ArrayList<>();
        String[] a = new String[]{"E12","1X1","21S"};
        for(String i:a){
            need.add(i);
        }
        sol.pathsWithMaxScore(need);
    }
}
class Solution4 {
    public int[] three = new int[3];
    public int[] pathsWithMaxScore(List<String> board) {
        int H = board.size();
        int W = board.get(0).length();
        int[][] list= new int[H][W];
        int[][] num= new int[H][W];
        //填满最后一行
        for(int i = W-2;i>=0;i--){
            if(board.get(H-1).charAt(i)=='X'){
                break;
            }
            else {
                if(i!=W-2){
                    list[H-1][i]=board.get(H-1).charAt(i)-'0'+list[H-1][i+1];
                }
                else {
                    list[H-1][i]=board.get(H-1).charAt(i)-'0';
                }
                num[H-1][i]=1;
            }
        }
        //填满最后一列
        for(int i = H-2;i>=0;i--){
            char c = board.get(i).charAt(W-1);
            if(c=='X'){
                break;
            }
            else {
                if(i!=H-2){
                    list[i][W-1] = c-'0'+list[i+1][W-1];
                }
                else {
                    list[i][W-1] = c-'0';
                }
                num[i][W-1]=1;
            }
        }
        System.out.print(Arrays.deepToString(list));
        for(int h = H-2;h>=0;h--){
            for(int w = W-2;w>=0;w--){
                char c = board.get(h).charAt(w);
                if(c=='X'){
                    continue;
                }

                else {
                    three[0] = list[h+1][w];
                    three[1] = list[h][w+1];
                    if(h==H-2&&w==W-2){
                         three[2] = 0;
                    }
                    else {
                        three[2]= list[h+1][w+1];
                    }

                    int max = 0;
                    for(int i = 2;i>=0;i--){
                        if(three[i]>max){
                            max = three[i];
                        }
                    }
                    if(c=='E'){
                        list[w][h] = max;
                    }
                    else {
                        list[w][h] = max +c-'0';

                    }
                    int cnt =0;
                    for(int i = 2;i>=0;i--){
                        if(three[i]==max){
                            if(i==0)cnt+=num[h+1][w];
                            else if(i==1)cnt+=num[h][w+1];
                            else cnt+=num[h+1][w+1];
                        }
                    }
                    num[h][w]=cnt;

                }

            }
        }
        int a1=list[1][0];
        int a2 = list[0][1];
        int a3 = list[1][1];

        System.out.println(Arrays.deepToString(num));
        if(num[0][0]==0){
            return new int[]{0,0};
        }
        else  return new int[]{list[0][0],num[0][0]};

    }
}