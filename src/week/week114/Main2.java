package week.week114;

import java.util.*;

public class Main2 {
    public static void main(String[]  args){
        Solution2 sol = new Solution2();
        boolean ans = sol.canReorderDoubled(new int[]{0,0});
        System.out.println(ans);
    }
}
class Solution2 {
    public boolean canReorderDoubled(int[] A) {
        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        for(int i :A){treemap.put(Math.abs(i),treemap.getOrDefault(Math.abs(i),0)+1);}
        List<Integer> list = new ArrayList<>(treemap.keySet());
        while(list.size()>0){
            int a = list.get(0);
            int b = 2*a;
//            if(list.get(0)==0&&treemap.get(0)%2!=0)return false;
//            else list.remove((Integer)0);
            if(list.get(0)==0){
                if(treemap.get(0)%2!=0)return false;
                else list.remove(0);
            }
            if (list.size()==0)return true;
            if(!treemap.containsKey(list.get(0)*2)) return false;
            if(treemap.get(list.get(0)*2)<treemap.get(list.get(0)))return false;
            else if (treemap.get(list.get(0) * 2).equals(treemap.get(list.get(0)))) {
                list.remove((Integer)a);
                list.remove((Integer)b);
            }
            else if (treemap.get(list.get(0) * 2) > treemap.get(list.get(0))){
                list.remove((Integer)a);
                treemap.put(b,treemap.get(b)-treemap.get(a));
            }


        }

        return true;

    }


}