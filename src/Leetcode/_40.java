package Leetcode;
import java.util.*;
public class _40 {
    public static void main(String[] args){
        Solution40 sol = new Solution40();
        sol.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }
}


class Solution40 {
    private int[]candidates;
    private int len;
    private List<List<Integer>> res1= new ArrayList<>();
    private Set<List<Integer>>  res = new HashSet<>();


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.len = candidates.length;
        this.candidates = candidates;
        Arrays.sort(candidates);
        findList(target,0,new ArrayList<>());
        System.out.println(res);
        res1.addAll(res);
        return res1;

    }
    public void findList(int resTarget, int start, List<Integer>sub ){
        if(resTarget == 0){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i = start; i < len&&resTarget - candidates[i]>=0;i++){
            sub.add(candidates[i]);
            findList(resTarget-candidates[i],i+1,sub);
            sub.remove(sub.size()-1);
        }
    }
}