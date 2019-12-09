package week.week165;
import java.util.*;
public class Main2 {
}

class Solution2 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int a = tomatoSlices - 2*cheeseSlices;
        if(a<0||a%2!=0)return new ArrayList<>();
        int b = cheeseSlices - a/2;
        if(b<0)return new ArrayList<>();
        return new ArrayList<>(Arrays.asList(a/2,cheeseSlices-a/2));

    }
}