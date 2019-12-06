package week.week142;

public class Main1 {
}

class Solution {
    public double[] sampleStats(int[] count) {
        double[] ans = new double[5];
        double min = 255;
        double max = 0;
        double mean = 0;
        int cnt = 0;//计数
        double zhongzhu = 0;
        int zzNum = 0;
        double sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i] * i;
            if (count[i] != 0 && i < min) min = i;
            if (count[i] != 0 && i > max) max = i;
            cnt+=count[i];
            if(count[i]>zzNum){
                zzNum = count[i];
                zhongzhu = i;
            }
        }
        for(int i = 1;i<count.length;i++) {
            count[i] += count[i - 1];

        }
        if(cnt%2==0){
            float x=0;
            float y=0;
            for(int i = 0;i<count.length;i++){
                if(cnt/2>=count[i]){
                    x=i;
                    break;
                }
            }
            for(int i = 0;i<count.length;i++){
                if(cnt/2+1>count[i]){
                    y=i;
                    break;
                }
            }
            ans[3]=(x+y)/2;

        }
        else{
            for(int i = 0;i< count.length;i++){
                if(cnt/2+1>count[i]){
                    ans[3]=i;
                    break;
                }
            }

        }

        mean = sum/cnt;

        ans[0] = min;
        ans[1] = max;
        ans[2] = mean;
        ans[4] = zhongzhu;
    return ans;
    }
}