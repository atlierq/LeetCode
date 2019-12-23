package week.doubleweek15;

public class Main1 {
}

class Solution1 {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int cnt = 1;
        int start = arr[0];
        int ans=arr[0];
        for(int i = 1;i<len;i++){
            if(arr[i]!=start){
                cnt = 0;
                start = arr[i];
            }
            else {
                cnt++;
                if(cnt>=len/4){
                    ans = arr[i];
                }
            }


        }

        return ans;
    }
}