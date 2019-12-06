package week.week93;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.reorderedPowerOf2(46);
    }
}
class Solution2 {
    public boolean reorderedPowerOf2(int N) {
        int x = 1;
        List<Integer> sb = new ArrayList<>();
        while(x < Math.pow(10,9)){
            sb.add(x);
            x*=2;
        }
        System.out.println(sb);
        boolean res =false;
        char[] need = Integer.toString(N).toCharArray();
        Arrays.sort(need);
        for(int i:sb){
            char[] test = Integer.toString(i).toCharArray();
            Arrays.sort(test);
            if(test.length==need.length){
                for(int j = 0; j<need.length;j++){
                    if(test[j]!=need[j]){
                        break;
                    }
                    if (j == need.length - 1) {
                        res = true;

                    }
                }
            }


        }
        System.out.println(res);
        return res;

    }
}