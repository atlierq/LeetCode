package Leetcode;

public class _11 {
    public static void main(String[] args){
        Solution11 sol=new Solution11();
        int a=sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(a);
    }
}
class Solution11 {
    public int maxArea(int[] height) {
        int maxnum=0;int l=0;int r=height.length-1;
        while(l<r){
            maxnum=Math.max(maxnum,(r-l)*Math.min(height[l],height[r]));
            if (height[l]>height[r]) r--;
            else l++;
        }
        return maxnum;

    }
}