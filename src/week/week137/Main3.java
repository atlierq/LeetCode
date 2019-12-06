package week.week137;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Solution3 sol = new Solution3();
        sol.longestStrChain(new String[] {"a","b","ba","bca","bda","bdca","absfs","abscdd"});
    }
}
class Solution3 {
    public int longestStrChain(String[] words) {
        Map<String,Integer> word = new HashMap<>();
        Map<Integer,List<String>> stringMap = new HashMap<>();
        int minlen = 17;
        for(String i : words){
            int len = i.length();
            if(minlen>len) minlen = len;
            if(!stringMap.containsKey(len)){
                List<String> sub = new ArrayList<>();
                sub.add(i);
                stringMap.put(len,sub);
            }
            else {
                stringMap.get(len).add(i);
            }
        }
        for(String a:stringMap.get(minlen)){
            word.put(a,1);
        }

        for(int i = minlen+1;i<=16;i++){
            if(stringMap.containsKey(i)&&stringMap.containsKey(i-1)){
                for(String s:stringMap.get(i)){
                    //获取每个字符串

                    //对每个字符串判断
                    boolean can = false;
                    for(int sub = 0;sub<s.length();sub++){
                        StringBuilder subSting = new StringBuilder(s);
                        if(word.containsKey(subSting.delete(sub,sub+1).toString())){
                            word.put(s,word.get(subSting.toString())+1);
                            can = true;
                            break;
                        }

                    }
                    if(!can){word.put(s,1);}
                }


                //每个字典里面的string

            }

        }
        System.out.println(word.toString());
        int ans = 0;
        for(int i : word.values()){
            if(i>ans)ans = i;
        }
        return ans;

    }
}