package week.week100;

public class Main1 {

}

class Solution1 {
    public boolean isMonotonic(int[] A) {
        boolean flag = true;
        boolean ans = true;
        int a = 0;
        for(int i = 1;i<A.length;i++){
            if(flag&&A[i]>A[i-1]){
                flag=false;
                a =1;
            }
            else if(flag&&A[i]<A[i-1]){
                flag=false;
                a=2;
            }
            if(a==1&&A[i]<A[i-1]){
                ans = false;
            }
            if(a==2&&A[i]>A[i-1]){
                ans = false;
            }
        }
        return ans;

    }
}