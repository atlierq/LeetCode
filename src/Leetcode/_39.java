package Leetcode;
import java.util.*;
public class _39 {
    public static void main(String[] args){
        Solution39 sol = new Solution39();
        sol.combinationSum(new int[]{2,3,6,7},7);
//        System.out.println();
    }
}


class Solution39 {
    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int len;


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.len = candidates.length;
        Arrays.sort(candidates);
        findList(target,0,new Stack<>());
        System.out.println(res);
        return res;

    }
    public void findList(int resTarget,int start,Stack<Integer> stack){
        if(resTarget==0){
            res.add(new ArrayList<>(stack));
            return;
        }
        for(int i = start;i < len&&resTarget-candidates[i]>=0;i++){
            stack.add(candidates[i]);

            findList(resTarget-candidates[i],i,stack);
            stack.pop();
        }
    }
}