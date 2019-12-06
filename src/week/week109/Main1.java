package week.week109;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
}

class RecentCounter {
    List<Integer> ans = new ArrayList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        ans.add(t);
        while(ans.get(ans.size()-1)-ans.get(0)>3000){
            ans.remove(0);
        }
        return ans.size();

    }
}