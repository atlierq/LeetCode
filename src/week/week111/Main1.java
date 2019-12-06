package week.week111;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        int ans = sol.minDeletionSize(new String[]{"cba", "daf", "ghi"});
        System.out.println(ans);
    }
}

class Solution1 {
    public int minDeletionSize(String[] A) {
        int cnt = 0;
        for(int i = 0; i<A[0].length(); i++){
            for(int x = 0; x<A.length-1;x++){
                if(A[x].charAt(i)>A[x+1].charAt(i)){cnt++;break;}
            }
        }

        return cnt;
    }
}