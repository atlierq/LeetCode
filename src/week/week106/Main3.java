package week.week106;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        int ans = sol.threeSumMulti(new int[]{2,1,3},6);
        System.out.println(ans);
//        System.out.println(sol.C(2,2));

    }
}
class Solution3 {
    public int threeSumMulti(int[] A, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> reAll = new ArrayList<>();
        for (int i: A){
            if (map.containsKey(i)){map.put(i,map.get(i)+1);}
            else {map.put(i,1);reAll.add(i);}
        }
//        List<int[]> ans = new ArrayList<>();
//        int[] subans = new int[3];
        Map<Integer,Integer> subMap=new HashMap<>();
        long allsum =0;
        for (int i = 0;i<reAll.size(); i++){
            for(int j = i;j<reAll.size(); j++){
                int need =target-reAll.get(i)-reAll.get(j);
                if (reAll.indexOf(need)>=j&&map.containsKey(need)){
                    subMap.put(reAll.get(i),1);
                    if (j==i){subMap.put(reAll.get(i),2);}
                    else {subMap.put(reAll.get(j),1);}
                    if (need==reAll.get(j)){subMap.put(need,subMap.get(need)+1);}
                    else subMap.put(need,1);
                    int cnt=0;
                    long subsum = 1;
//                    System.out.println(subMap.toString());
                    for (int key :subMap.keySet()){
                        if(subMap.get(key)>map.get(key)){subMap.clear();break;}
                        else {subsum*=C(map.get(key),subMap.get(key));cnt++;}
                    }
                    if(cnt==subMap.size()&&cnt>0){allsum+=subsum;subMap.clear();}


                }

            }
        }
//        System.out.println(reAll.toString());
        return (int)(allsum%1000000007);
    }
    public long C(int a,int b){
        //a 大
        long fenzi=1;
        long fenmu=1;
        for(int i=0;i<b;i++){
            fenzi*=a;
            a--;
        }

        for(int i=b;i>0;i--){
            fenmu*=i;
        }
        return fenzi/fenmu;

    }
}