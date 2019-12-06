package week.week126;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1},0);
    }
}

class Solution3 {
    public int longestOnes(int[] A, int K) {
        int l = 0;
        int r = 0;
        int cnt = 0;
        int max = -1;
        while (r<A.length){
            if(A[r]==1){
                if(r==A.length-1){
                    if(r-l+1>max)max=r-l+1;
                }
                r++;

            }
            else {
                // ==0;
                if (cnt<K){
                    if(r==A.length-1){
                        if(r-l+1>max)max=r-l+1;
                    }
                    r++;
                    cnt++;
                }
                else if(cnt==K){
                    if(r-l>max)max=r-l;
                    if(A[l]==0){cnt--;}
                    l++;

                }

            }

        }
        System.out.println(max);
        return max;

    }
}