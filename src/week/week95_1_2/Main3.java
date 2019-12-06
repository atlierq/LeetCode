package week.week95_1_2;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        sol.nthMagicalNumber(1000000000
                ,40000
                ,40000);
    }

}

class Solution3 {
    public int nthMagicalNumber(int N, int A, int B) {
        int a = lcm(A, B);
        System.out.println(a);
        List<Long> niceList = new ArrayList<>();
        long i = 1;
        long j = 1;
        while (A * i <= a && B * j <= a) {
            if (i * A < j * B) {
                niceList.add(i * A);
                i++;
            } else if (i * A > j * B) {
                niceList.add(j * B);
                j++;
            } else {
                niceList.add(j * B);
                i++;
                j++;
            }
        }
        System.out.println(niceList);
        int len = niceList.size();
        long ans = 0;
        //niceList.get(len-1)*(N/len)+niceList.get(N%len-1);
        if (N % len != 0) {
            ans = niceList.get(len - 1) * (N / len) + niceList.get(N % len - 1);
        } else {
            ans = niceList.get(len - 1) * (N / len);
        }
        System.out.println(ans%1000000007);
        return (int)(ans%1000000007);
    }
    public static int lcm(int p, int q){
        int p1 = p;
        int q1 = q;

        while(q != 0){
            int r = p % q;
            p = q;
            q = r;
        }
        return (p1*q1)/p;
    }


}
