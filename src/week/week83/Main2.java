package week.week83;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        sol.maskPII("+(501321)-50-23431");
    }
}

class Solution2 {
    public String maskPII(String S) {
        int len =S.length();
        if (Character.isAlphabetic(S.charAt(0))){
            String source=S.toLowerCase();
            int i=S.indexOf('@');
//            System.out.println(i);
            StringBuilder ans=new StringBuilder(source.charAt(0)+"*****"+source.subSequence(i-1,len));
            System.out.println(ans);
            return ans.toString();
        }
        else{
            int cnt=0;
            StringBuilder ans=new StringBuilder();
            for (int i=len-1;i>=0;i--) {
//                System.out.println(i);
                if (S.charAt(i)>=48&&S.charAt(i)<=57)
                {
                    cnt++;
                    if (cnt==5||cnt==8||cnt==11){ans.insert(0,'-');}
                    if(cnt>=5) ans.insert(0,'*');
                    else  ans.insert(0,S.charAt(i));

                }

            }
            if (cnt>=11) ans.insert(0,'+');

            return  ans.toString();
        }

    }
}