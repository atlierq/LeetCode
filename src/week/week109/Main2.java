package week.week109;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int ans = sol.knightDialer(3);
        System.out.println(ans);
    }
}

class Solution2 {
    public int knightDialer(int N) {
        if(N==1)return 10;
        int[] ans = new int[10];
        int[] mid = new int[]{1,1,1,1,1,0,1,1,1,1};
        for(int i = 1;i<N;i++){
//            System.out.println(Arrays.toString(mid));
            for(int x =0;x<10;x++){
                System.out.println(Arrays.toString(ans));
                switch (x){
                    case 0:{ans[4]+=mid[0];ans[6]+=mid[0];break;}
                    case 1:{ans[6]+=mid[1];ans[8]+=mid[1];break;}
                    case 2:{ans[7]+=mid[2];ans[9]+=mid[2];break;}
                    case 3:{ans[4]+=mid[3];ans[8]+=mid[3];break;}
                    case 4:{ans[3]+=mid[4];ans[9]+=mid[4];ans[0]+=mid[4];break;}
                    case 5:{break;}
                    case 6:{ans[1]+=mid[6];ans[7]+=mid[6];ans[0]+=mid[6];break;}
                    case 7:{ans[6]+=mid[7];ans[2]+=mid[7];break;}
                    case 8:{ans[1]+=mid[9];ans[3]+=mid[8];break;}
                    case 9:{ans[2]+=mid[9];ans[4]+=mid[9];break;}
                }

            }

            mid=ans.clone();
            for (int x=0;x<10;x++){
                ans[x]=0;
            }
            System.out.println("   "+Arrays.toString(ans)+"   ");

        }
//        System.out.println(Arrays.toString(ans));

        int trueAns = 0;
        for (int i :mid){
            trueAns +=i;
        }
        return trueAns;

    }
}