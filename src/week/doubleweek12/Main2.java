package week.doubleweek12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.transformArray(new int[]{1,5,4,7,9,2,5,1,2,5,8,8,3,8,4,4,6,3
});
    }
}


class Solution2 {
    public List<Integer> transformArray(int[] arr) {
        int[] trans = new int[arr.length];
        trans[0] = arr[0];
        trans[arr.length-1] = arr[arr.length-1];
        int step = 0;
        while(true){
            for(int i = 1 ;i < trans.length-1;i++){
                if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                    trans[i]=arr[i]-1;
                    step++;
                }
                else if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
                    trans[i] = arr[i]+1;
                    step++;
                }
                else{
                    trans[i] = arr[i];
                }
            }
            for(int i = 0;i<arr.length;i++){
                arr[i]=trans[i];
            }
            if(step==0) break;
            step=0;

        }
        List<Integer> ans = new ArrayList<>();
        for (int value : arr) {
            ans.add(value);
        }
        System.out.println(ans.toString());
        return ans;


    }

}