package week.week162;

public class Main4 {
    public static void main(String[] args){
        Solution4 sol = new Solution4();
        sol.maxScoreWords(new String[]{"dog","cat","dad","good"},new char[]{'a','a','c','d','d','d','g','o','o'},new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0});
    }
}


class Solution4 {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        //储存可以用字符
        int[] canuse = new int[26];
        for(char ch:letters){
            canuse[ch-'a']++;
        }
        int n = words.length;
        int maxScore = 0;
        for(int i=1;i<=(int)(Math.pow(2,n)-1);i++){
            String method = Integer.toBinaryString(i);
            int[] sub = new int[26];
            for(int flag = method.length()-1;flag>=0;flag--){
                //确定words中的1
                if(method.charAt(flag)==1){
                    //在words的中位置为
                }

            }
        }
        return 1;
    }

}