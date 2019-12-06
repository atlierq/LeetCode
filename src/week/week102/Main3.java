package week.week102;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4});
        System.out.println(ans);
    }
}

class Solution3 {
    public int totalFruit(int[] tree) {
        Map<Integer,Integer> map = new HashMap<>();

        int cnt=0;
        int start=-1;
        int sum=0;
        for(int i = 0; i<tree.length; i++){
            if(!map.containsKey(tree[i])){
                if(cnt>=2) {
                    sum = Math.max(i - start - 1, sum);
                    int useKey = 0;
                    for (int x : map.keySet()) {
                        if (x != tree[i - 1]){useKey = x;}

                    }
                    start = map.get(useKey);
                    map.remove(useKey);
                }
                cnt++;
                map.put(tree[i],i);}
            else {map.put(tree[i],i);}
        }
        sum=Math.max(sum,tree.length-start-1);


    return sum;
    }
}