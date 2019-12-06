package week.doubleweek13;
import java.util.*;
public class Main1 {
}
class Solution1 {
    public String encode(int num) {
        return Integer.toBinaryString(num+1).substring(1);

    }
}