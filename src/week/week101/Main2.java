package week.week101;

import java.util.*;

public class Main2 {
}

class StockSpanner {
    Stack<Integer> stack;
    Map<Integer,Integer> map;


    public StockSpanner() {
        stack=new Stack<>();
        map=new HashMap<>();


    }

    public int next(int price) {
        int cnt=1;
        while (!stack.isEmpty()&&stack.peek()<price){cnt+=map.get(stack.pop());}
        map.put(price,cnt);
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */