package week.week128;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.bitwiseComplement(2100);
    }
}

class Solution1 {
    public int bitwiseComplement(int N) {
        String a = Integer.toBinaryString(N);
//        System.out.println(a);
        StringBuilder ans = new StringBuilder();
        for (char ch :a.toCharArray()){
            if (ch=='0') ans.append(1);
            else if (ch=='1') ans.append(0);
        }
        int tans = Integer.parseInt(ans.toString(),2);
        System.out.println(tans);
        return tans;

    }
}