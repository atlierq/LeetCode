package week.week121;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        String ans = sol.strWithout3a3b(4,1);
        System.out.println(ans);
        }
}

class Solution1 {
    public String strWithout3a3b(int A, int B) {
        StringBuilder ans = new StringBuilder();
        if (A>B){
            int slice = A/2;
            int B2 = B-slice;
            for(int i =0;i<slice;i++){
                if (i<B2){
                    ans.append("aabb");
                    B-=2;
                }
                else {
                    ans.append("aa");
                    if (B>0){ans.append("b");B--;}
                }
            }

            if(A%2!=0)ans.append("a");
        }
        else if(A<B){
            int slice = B/2;

            int A2 = A-slice;
            for(int i =0;i<slice;i++){
                if (i<A2){
                    ans.append("bbaa");
                    A-=2;
                }
                else {
                    ans.append("bb");
                    if (A>0){ans.append("a");A--;}
                }
            }

            if(B%2!=0)ans.append("b");
        }
        else {
            int slice = A/2;
            for(int i = 0; i < slice; i++){
                ans.append("aabb");
            }
            if(A%2!=0) ans.append("ab");
        }
    return ans.toString();
    }
}