package week144;

public class Main2 {
    public static void main(String[] args){
        int[]values = {5,4,3,2,1};int[] labels = {1,1,2,2,3};int num_wanted = 3;int use_limit = 1;
        Solution1 sol=new Solution1();
        sol.largestValsFromLabels(values,labels,num_wanted,use_limit);
    }
}
class Solution1 {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        int wanted_i=0;
        int use_i=0;
        int cnt=0;
        int same=labels[0];
        for (int i=0;i<labels.length;i++)
        {
            cnt+=labels[i];
            


        }

        return 0;
    }
}