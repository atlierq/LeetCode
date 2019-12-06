package week.week114;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.minDeletionSize(new String[]{"xga","xfb","yfa"});
    }


}
class Solution3 {
    public int minDeletionSize(String[] A) {
        int cnt =0;
        for (int i = 0; i < A[0].length(); i++){
            int sub =0;
            for(int j = 0 ; j < A.length-1; j++){
                if (A[j].charAt(i)>A[j+1].charAt(i)){
                    cnt++;
                    break;
                }
                else sub++;
            }
            if(sub==A.length-1) return cnt;
        }
        return cnt;

    }
}