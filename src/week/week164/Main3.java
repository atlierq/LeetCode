package week.week164;
import javax.swing.*;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse");

    }
}
class Solution3 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        List<String> sub = new ArrayList<>(Arrays.asList(products));
        Collections.sort(sub);
        for(int i = 0;i<searchWord.length();i++){
            String search = searchWord.substring(0,i+1);
            List<Integer> no = new ArrayList<>();
            for(int j = 0; j<sub.size();j++){
                if(sub.get(j).length()<i+1||!sub.get(j).substring(0,i+1).equals(search)){
                    no.add(j);
                }
            }
            int cnt =0;
            for(int j :no){
                sub.remove(j-cnt);
                cnt++;
            }
            if(sub.size()>3){
                ans.add(new ArrayList<>(sub.subList(0,3)));
            }
            else{
                ans.add(new ArrayList<>(sub));
            }
        }
    return ans;
    }
}