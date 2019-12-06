package leetcode;

public class _5 {
    public static void main(String[] args){
        Solution5 sol=new Solution5();
        sol.longestPalindrome("abcdef");

    }
}
class Solution5 {
    public String longestPalindrome(String s) {
        int len=s.length();

        boolean [][] mat=new boolean[len][len];
        for (int i=0;i<len;i++){mat[i][i]=true;}
        printmax(mat);


    return "sss";
    }
    public void printmax(boolean [][] mat){
        int len=mat.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){System.out.print(mat[i][j]);
                if(j==len-1) System.out.println();}
        }

    }
}