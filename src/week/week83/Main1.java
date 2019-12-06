package week.week83;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol=new Solution1();
        System.out.println(sol.largeGroupPositions("aaa"));
    }
}

class Solution1 {
    public List<List<Integer>> largeGroupPositions(String S) {
        int l=0;
        int r=1;
        List<List<Integer>> ans=new ArrayList<>();
        int len=S.length();
        while (r<len){

            if (S.charAt(r)==S.charAt(l)){
                if(r==(len-1)&&r-l>=2){
                    List<Integer> cnt=new ArrayList<>();
                    cnt.add(l);
                    cnt.add(r);
                    ans.add(cnt);
                }
                r++;
            }
            else {
                if (r-l>=3)
                {
                    List<Integer> cnt=new ArrayList<>();
                    cnt.add(l);
                    cnt.add(r-1);
                    ans.add(cnt);
                    l=r;
                    r++;
                }
                else{
                    l=r;
                    r++;
                }
            }


        }
    return ans;
    }
}