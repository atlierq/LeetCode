package week.week154;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        System.out.println(sol.kConcatenationMaxSum(new int[] {1,0,4,1,4},4));
//        List<Integer> test =new ArrayList<>(Arrays.asList(-5,-2,0,0,3,9,-2,-5,4));
//
//        System.out.println(sol.maxsub(test));

    }
}


class Solution3 {
    public int kConcatenationMaxSum(int[] arr, int k) {
        List<Long> arrList=new ArrayList<>();
        long sum=0;
        for (long i:arr){
            arrList.add(i);
            sum+=i;
        }
        List<Long> reList=new ArrayList<>();
        for (long i:arrList){reList.add(i);}
        reList.addAll(arrList);
//        System.out.println(reList);
        long result=0;
        if (k==0){result=0;}
        if (k==1){result=maxsub(arrList);}
        if (k==2){result=maxsub(reList);}
        if (k>=3){
            System.out.println(sum);
            System.out.println(maxsub(reList));
            if (sum>0){
                result=maxsub(reList)+(k-2)*sum;
            }
            else {result=maxsub(reList);}
        }

//        if (k==2){result}
        return (int)(result%1000000007);
    }
    public long maxsub(List<Long> arrList){
        List<Long> sumcnt=new ArrayList<>();
        long maxsum=arrList.get(0);
        sumcnt.add(maxsum);
        for (int i=1;i<arrList.size();i++)
        {
            maxsum=Math.max(sumcnt.get(i-1)+arrList.get(i),arrList.get(i));
            sumcnt.add(maxsum);
        }
//        System.out.println(sumcnt);
        long max=0;
        for (long i:sumcnt){if (i>max) max=i;}
        return max;
    }
}