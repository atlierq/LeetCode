package week.week168;
import java.util.*;
public class Main4 {
    public static void main(String[] args){}
}

class Solution1 {
    int ans = 0;
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int len = status.length;//盒子数
        int[] box = new int[len];
        int[] key = new int[len];
        int[] ed = new int[len];
        for(int i = 0; i < initialBoxes.length; i++){

            int num = initialBoxes[i];
            ed[num]=1;
            //获得钥匙
            for(int x:keys[num]){
                key[x] = 1;
            }
            //获得盒子
            for(int x:containedBoxes[num]){
                box[x]=1;
            }
            ans += candies[num];

        }
        List<Integer> ls = canopen(status,box,key,ed);
        while(ls.size()!=0){
            for(int i:ls){
                ans+=candies[i];
                for(int x:keys[i]){
                    key[x] = 1;
                }
                for(int x:containedBoxes[i]){
                    box[x]=1;
                }
            }


            ls = canopen(status,box,key,ed);
        }
        return ans;
    }
    public List<Integer> canopen(int[] status, int[] box, int[] key, int[] ed){
        List<Integer> may = new ArrayList<>();

        for(int i = 0; i < key.length; i++){
            if(key[i]==1&&ed[i]==0&&box[i]==1){
                may.add(i);
                ed[i]=1;
            }
        }
        for(int i =0;i<key.length;i++){
            if(ed[i]==0&&status[i]==1&&box[i]==1){
                may.add(i);
                ed[i]=1;
            }
        }
        return may;
    }
}