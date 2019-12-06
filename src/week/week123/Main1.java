package week.week123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.addToArrayForm(new int[]{2,1,5},806);
    }
}

class Solution1 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        String Ktest = String.valueOf(K);
        List<Integer> ans = new ArrayList<>();
        if (Ktest.length()>A.length){
            boolean add = false;
            int sum = 0;
            for (int i =A.length-1 ;i>=0;i--){
                int num = Ktest.charAt(i+Ktest.length()-A.length)-'0';
                if (add) {sum = A[i]+num+1;}
                else sum = A[i]+num;
                if (sum>=10) add = true;
                else add = false;
                ans.add(0,sum%10);
            }
            for(int i = Ktest.length()-A.length-1 ;i >=0;i--){
                int num = Ktest.charAt(i)-'0';
                if (add) {sum = num+1;}
                else sum = num;
                if (sum>=10) add = true;
                else add = false;
                ans.add(0,sum%10);
            }
            if(add) ans.add(0,1);

        }
        else{
            boolean add = false;
            int sum = 0;
            for (int i =Ktest.length()-1 ;i>=0;i--){
                int num = Ktest.charAt(i)-'0';
                if (add) {sum = A[i+A.length-Ktest.length()]+num+1;}
                else sum = A[i+A.length-Ktest.length()]+num;
                if (sum>=10) add = true;
                else add = false;
                ans.add(0,sum%10);
            }
            for(int i = A.length-Ktest.length()-1 ;i >=0;i--){
                if (add) {sum = A[i]+1;}
                else sum = A[i];
                if (sum>=10) add = true;
                else add = false;
                ans.add(0,sum%10);
            }
            if(add) ans.add(0,1);

        }


        System.out.println(ans);
        return ans;
    }
}