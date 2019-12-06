package week144;

import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution sol=new Solution();
        int [] arr={8,4,5,0,0,0,0,7};
        sol.duplicateZeros(arr);
    }


}


class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr1=arr.clone();
        int cnt=0;
        int len=arr.length;
        for (int i:arr1)
        {
            if (i==0)
            {
                if (cnt<=len-2) {arr[cnt]=0;arr[cnt+1]=0;cnt+=2;}
                else if (cnt==len-1){arr[cnt]=0;cnt+=1;}
                else break;
            }
            else
                {
                    if(cnt<=len-1){arr[cnt]=i;cnt+=1;}
                    else break;

                }

        }
        for(int i:arr){System.out.print(i+" ");}
        System.out.println();
        for(int i:arr1){System.out.print(i+" ");}


    }
}