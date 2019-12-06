package Leetcode;

public class _42 {
    public static void main(String[] args){
        Solution42 sol=new Solution42();
        int a=sol.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(a);
    }
}
class Solution42 {
    public int trap(int[] height) {
        int len=height.length;
        if (len==0) return 0;
        int [] leftMax=new int[len];
        int [] rightMax=new int[len];

        leftMax[0]=0;

        rightMax[len-1]=0;
        for(int i=1;i<len;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }
        for(int i=len-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);

        }
        for(int i:leftMax) System.out.print(i+" ");
        System.out.println();
        for(int i:rightMax) System.out.print(i+" ");
        int sum=0;
        for(int i=1;i<len-1;i++){

            int aa=Math.min(leftMax[i],rightMax[i])-height[i];

            if(aa>0) sum+=aa;

        }

        return sum;
    }
}