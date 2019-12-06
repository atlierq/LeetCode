package week.week101;

import java.util.Map;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        int ans=sol.atMostNGivenDigitSet(new String[]{"1"},
                834);
        System.out.println(ans);
    }
}

class Solution3 {
    public int atMostNGivenDigitSet(String[] D, int N) {
        String NString=String.valueOf(N);
        int len=NString.length();
        int cnt=0;
        //计算位数小于length的全部个数
        int i=1;
        while(i<len){cnt+=Math.pow(D.length,i);i++;}
//        System.out.println(cnt);
        //考虑位数一样的情况
        int flag=0;

        while(flag<len){
            for(String x:D){
                if (x.charAt(0)<NString.charAt(flag)){
                    cnt+=Math.pow(D.length,len-1-flag);
                    if(x.equals(D[D.length-1])){return cnt;}

                }
                else if(x.charAt(0)==NString.charAt(flag)){
                    if(flag==len-1){
                        flag++;cnt++;break;}
                    else {
                        flag++;
                        break;}

                }
                else {
                    return cnt;

                }

            }

        }
//        System.out.println(cnt);
        return cnt;

    }
}