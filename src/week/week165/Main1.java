package week.week165;

public class Main1 {
}

class Solution1 {
    public String tictactoe(int[][] moves) {
        int[][] ans = new int[3][3];
        for(int i = 0; i<moves.length;i++){
            if(i%2==0){
                ans [moves[i][0]][moves[i][1]] = 1;
            }
            else ans [moves[i][0]][moves[i][1]] = 2;
        }
        if(ans[0][0]==ans[0][1]&&ans[0][1]==ans[0][2]){
            if(ans[0][0]==1){return "A";}
            else if(ans[0][0]==2)return "B";
        }
        if(ans[1][0]==ans[1][1]&&ans[1][1]==ans[1][2]){
            if(ans[1][0]==1){return "A";}
            else if(ans[1][0]==2)return "B";
        }
        if(ans[2][0]==ans[2][1]&&ans[2][1]==ans[2][2]){
            if(ans[2][0]==1){return "A";}
            else if(ans[2][0]==2)return "B";
        }
        if(ans[0][0]==ans[1][0]&&ans[1][0]==ans[2][0]){
            if(ans[0][0]==1){return "A";}
            else if(ans[0][0]==2)return "B";
        }
        if(ans[0][1]==ans[1][1]&&ans[1][1]==ans[2][1]){
            if(ans[0][1]==1){return "A";}
            else if(ans[0][1]==2)return "B";
        }
        if(ans[0][2]==ans[1][2]&&ans[1][2]==ans[2][2]){
            if(ans[0][2]==1){return "A";}
            else if(ans[0][2]==2)return "B";
        }
        if(ans[0][0]==ans[1][1]&&ans[1][1]==ans[2][2]){
            if(ans[0][0]==1){return "A";}
            else if(ans[0][0]==2)return "B";
        }
        if(ans[0][2]==ans[1][1]&&ans[1][1]==ans[2][0]){
            if(ans[0][2]==1){return "A";}
            else if(ans[0][2]==2)return "B";
        }
        for(int i=0;i<3;i++){
            for(int j =0;j<3;i++){
                if(ans[i][j]==0){
                    return "Pending";
                }
            }
        }
        return "Draw";
    }
}