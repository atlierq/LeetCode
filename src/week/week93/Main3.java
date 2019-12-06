package week.week93;
import java.util.*;
public class Main3 {
}

class Solution3 {
    public int[] advantageCount(int[] A, int[] B) {
        Combine[] reB = new Combine[B.length];
        for(int i = 0; i < B.length ; i++){
            reB[i] = new Combine(B[i],i);
        }
        Arrays.sort(reB, new Comparator<Combine>() {
            @Override
            public int compare(Combine o1, Combine o2) {
                return o1.a-o2.a;
            }
        });
        Arrays.sort(A);
        int[] res = new int[A.length];
        int left = 0;
        int right = A.length-1;
        for(int i = B.length-1; i >= 0;i--){
            //如果最大的都没有B的大
            if(reB[i].a>=A[right]){
                res[reB[i].b] = A[left];
                left++;
            }
            else{
                res[reB[i].b] = A[right];
                right--;
            }
        }
        return res;
    }

}
class Combine{
    int a;
    int b;
    Combine(int a,int b){
         this.a = a;
         this.b = b;
    }
}