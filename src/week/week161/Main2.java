package week.week161;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int ans = sol.numberOfSubarrays(new int[]{1,1,2,1,1},3);
        System.out.println(ans);
    }
}
class Solution2 {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for(int i : nums){
            if (i%2==0) cnt++;
            else {
                list.add(cnt+1);
                cnt=0;
            }
        }
        list.add(cnt+1);
        System.out.println(list.toString());
        if (list.size()-1<k) return -1;
        int res = 0;
        for(int i = 0;i<list.size()-k;i++){
            res += list.get(i)*list.get(i+k);
        }
        return res;

    }
}