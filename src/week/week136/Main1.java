package week.week136;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.isRobotBounded("GLRLLGLL");
    }
}

class Solution1 {
    public boolean isRobotBounded(String instructions) {
        int face = 0;
        int x = 0;
        int y = 0;
        for(char ch : instructions.toCharArray()){
            if(ch=='G'){
                if(face==0) y++;
                else if(face==1)x++;
                else if(face==2)y--;
                else x--;
                System.out.println(x+" "+y);
            }
            else if(ch=='L'){
                if(face==0){face=3;}
                else face--;
            }
            else {
                if(face==3)face=0;
                else face++;

            }
        }
        if(face!=0)return true;
        if(x!=0||y!=0) return false;
        else return false;

    }
}