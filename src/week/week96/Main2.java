package week.week96;
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args){
        Solution2 sol=new Solution2();
        int a=sol.numRescueBoats(new int[]{3,5,3,4},5);
        System.out.println(a);

    }
}

class Solution2 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int len=people.length;
        int l=0;
        int r=len-1;
        //计数
        int cnt=0;
        while(l<r){
            if (people[l]+people[r]>limit){r--;cnt++;}
            else {l++;r--;cnt++;}

        }
        if (l==r) cnt++;

        return cnt;


    }
}