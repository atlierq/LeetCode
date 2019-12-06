package week.week91;

public class Main1 {
}

class Solution1 {
    public boolean lemonadeChange(int[] bills) {
        int cnt5 = 0;
        int cnt10 = 0;
        boolean ans = true;
        for (int i =0;i < bills.length; i++){
            if (bills[i]==5){
                cnt5++;
            }
            else if(bills[i]==10){
                if (cnt5<1){
                    ans = false;
                    break;
                }
                else {
                    cnt5--;
                    cnt10++;
                }

            }
            else {
                if(cnt10>=1){
                    if(cnt5>=1){
                        cnt10--;
                        cnt5--;
                    }
                    else {
                        ans = false;
                        break;
                    }
                }
                else {
                    if(cnt5<3){
                        ans = false;
                        break;
                    }
                    else {
                        cnt5-=3;
                    }

                }

            }

        }
        return ans;

    }
}