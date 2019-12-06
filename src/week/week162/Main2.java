package week.week162;
import java.util.*;
public class Main2 {
}
class Solution2 {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        int cnt2 = 0;
        for(int i:colsum){
            sum += i;
            if(i==2){cnt2++;}
        }
        List<List<Integer>> ans = new ArrayList<>();

        if(upper+lower!=sum||cnt2>upper||cnt2>lower){
            return ans;
        }
        List<Integer> sub1 = new ArrayList<>();
        List<Integer> sub2 = new ArrayList<>();
        ans.add(sub1);
        ans.add(sub2);
        int need = upper-cnt2;
        for(int i = 0;i<colsum.length;i++){
            if(colsum[i]==0){
                ans.get(0).add(0);
                ans.get(1).add(0);

            }
            else if(colsum[i]==1){
                if(need>0){
                    ans.get(0).add(1);
                    ans.get(1).add(0);
                    need--;
                }
                else {
                    ans.get(0).add(0);
                    ans.get(1).add(1);
                }
            }
            else {
                ans.get(0).add(1);
                ans.get(1).add(1);
            }
        }
        return ans;

    }
}