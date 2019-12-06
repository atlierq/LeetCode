package week.week155;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        sol.minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27});
    }
}

class Solution1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int len= arr.length;
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        List <List<Integer>> ans=new ArrayList<>();
        List<Integer> slip=new ArrayList<>();
        slip.add(arr[0]);
        slip.add(arr[1]);
        ans.add(slip);
        for(int i=2;i<len;i++){
            if ((arr[i]-arr[i-1])<min){
                min=arr[i]-arr[i-1];
                ans.clear();
                List<Integer> slip1=new ArrayList<>();
                slip1.add(arr[i-1]);
                slip1.add(arr[i]);
                ans.add(slip1);
            }
            else if((arr[i]-arr[i-1])==min){
                List<Integer> slip1=new ArrayList<>();
                slip1.add(arr[i-1]);
                slip1.add(arr[i]);
                ans.add(slip1);
            }
            else continue;

        }
        System.out.println(ans);
        return ans;


    }
}