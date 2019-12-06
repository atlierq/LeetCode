package week.week159;

public class Main1 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        sol.checkStraightLine(new int[][]{{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}});
    }
}
//[[-4,-3],[1,0],[3,-1],[0,-1],[-5,2]]
class Solution1 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates[1][0]==coordinates[0][0]){
            for(int i = 1; i < coordinates.length-1; i++){
            if(coordinates[i][0]!=coordinates[1][0])return false;
            }
        }
        if(coordinates[1][1]==coordinates[0][1]){
            for(int i = 1; i < coordinates.length-1; i++){
                if(coordinates[i][1]!=coordinates[1][1])return false;
            }

        }
        else {
            float must = (float) (coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
            for(int i = 1; i < coordinates.length-1; i++){
                if ((coordinates[i+1][0]-coordinates[i][0])==0)return false;
                if((float)(coordinates[i+1][1]-coordinates[i][1])/(coordinates[i+1][0]-coordinates[i][0])!=must)return false;
            }

        }
        return true;
    }
}