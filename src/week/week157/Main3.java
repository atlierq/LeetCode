package week.week157;
import java.util.Arrays;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.countVowelPermutation(144);
        System.out.println(ans);

    }
}

class Solution3 {
    public int countVowelPermutation(int n) {

        long[] ans=new long[]{1,1,1,1,1};
        long[] midAns=new long[5];
        int i=1;
        int mod = 1000000007;
        while(i<n){
            midAns[0] = (ans[1] + ans[4] + ans[2])% mod;
            midAns[1] = (ans[0] + ans[2])% mod;
            midAns[2] = (ans[1] + ans[3])% mod;
            midAns[3] = (ans[2])% mod;
            midAns[4] = (ans[3] + ans[2])% mod;
            ans=midAns.clone();
            i++;
        }

        System.out.println(Arrays.toString(ans));
        long cnt=0;
        for(long x: ans ){cnt+=x;}
        return (int)(cnt% mod);
    }
}