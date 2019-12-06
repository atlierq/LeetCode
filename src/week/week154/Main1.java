package week.week154;

public class Main1 {
    public static void main(String[] args){
        Solution sol=new Solution();
        int a=sol.maxNumberOfBalloons("loonbalxballpoon");
        System.out.println(a);
    }


}
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b_num=0,a_num=0,l_num=0,o_num=0,n_num=0;
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)=='b'){b_num+=1;}
            else if (text.charAt(i)=='a'){a_num+=1;}
            else if (text.charAt(i)=='l'){l_num+=1;}
            else if (text.charAt(i)=='o'){o_num+=1;}
            else if (text.charAt(i)=='n'){n_num+=1;}
            else {continue;}
//            System.out.println(text.charAt(i));

        }
        l_num=l_num/2;
        o_num=o_num/2;
        return Math.min(Math.min(Math.min(b_num,a_num),Math.min(l_num,o_num)),n_num);


    }
}