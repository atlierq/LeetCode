package week.doubleWeek10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;

public class Main3 {
    public static void main(String[] args){
        Solution3 sol=new Solution3();
        int a = sol.getIntLenth(0);
        System.out.println(a);
    }
}

class Solution3 {
    public List<Integer> countSteppingNumbers(int low, int high) {

        return new ArrayList<>(Arrays.asList(1,2));
    }
    public int getIntLenth(int test){
        String a=String.valueOf(test);
        int len =a.length();
        int firstNum=Integer.parseInt(a.substring(0,1));
        return (int)(firstNum*pow(10,len-1));
    }

}