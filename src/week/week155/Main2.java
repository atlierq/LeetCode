package week.week155;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Solution2 sol=new Solution2();
//        "udyyek"
//                [[3,3],[3,0],[5,1],[3,1],[3,4],[3,5]]"udyyek"
//[[3,3],[3,0],[5,1],[3,1],[3,4],[3,5]]
        //[[3,3],[3,0],[5,1],[3,1],[3,4],[3,5]]
        List<Integer> cnt1= new ArrayList<>(Arrays.asList(3,3));
        List<Integer> cnt2= new ArrayList<>(Arrays.asList(3,0));
        List<Integer> cnt3= new ArrayList<>(Arrays.asList(5,1));
        List<Integer> cnt4= new ArrayList<>(Arrays.asList(3,1));
        List<Integer> cnt5= new ArrayList<>(Arrays.asList(3,4));
        List<Integer> cnt6= new ArrayList<>(Arrays.asList(3,5));
//        List<Integer> cnt7= new ArrayList<>(Arrays.asList(4,7));
//        List<Integer> cnt4= new ArrayList<>(Arrays.asList(4,7));
        List<List<Integer>> input=new ArrayList<>();
        input.add(cnt1);
        input.add(cnt2);
        input.add(cnt3);
        input.add(cnt4);
        input.add(cnt5);
        input.add(cnt6);
        sol.smallestStringWithSwaps("udyyek",input);


    }
}

class Solution2 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        List<List<Integer>> all=new ArrayList<>();
        List<List<Character>> all1=new ArrayList<>();
        for (List<Integer> i:pairs){
//            System.out.println(i);
            search(i,all);
//            System.out.println(all);
        }
        for (List<Integer> i:all){
            Collections.sort(i);
        }
        StringBuilder mayAns=new StringBuilder(s);
        for (List<Integer> i:all){
            List<Character> all1_sub=new ArrayList<>();
            for(int x:i){all1_sub.add(mayAns.charAt(x));}
            Collections.sort(all1_sub);
            all1.add(all1_sub);
        }

        System.out.println(all);
        System.out.println(all1);
        for (int i=0;i<all.size();i++){
            for (int j=0;j<all.get(i).size();j++){
                mayAns.setCharAt(all.get(i).get(j),all1.get(i).get(j));
            }
        }
        System.out.println(mayAns);
    return mayAns.toString();
    }
    public void  search(List<Integer> num_list,List<List<Integer>> all){
        //eg1.2个元素都没相同的
        //eg2.有个元素有相同的
        //eg3.2个都相同
        boolean l_exit=false;
        int l_pos=0;
        boolean r_exit=false;
        int r_pos=0;
        boolean single_exit=false;
        int single_pos=0;
        int len=all.size();

        if (!num_list.get(0).equals(num_list.get(1))){
            for (int i=0;i<len;i++){
                if (all.get(i).contains(num_list.get(0))){l_exit=true;l_pos=i;}
                if (all.get(i).contains(num_list.get(1))){r_exit=true;r_pos=i;}
            }
            if (l_exit&&r_exit){
                if(l_pos!=r_pos){
                    if (all.get(l_pos).size()>=all.get(r_pos).size()){
                        all.get(r_pos).addAll(all.get(l_pos));
                        all.remove(l_pos);

                    }
                    else{ all.get(l_pos).addAll(all.get(r_pos));
                        all.remove(r_pos);}
                    }
                }
//            System.out.println(all);
            if (l_exit&&!r_exit){all.get(l_pos).add(num_list.get(1));}
//            System.out.println(all);
            if (!l_exit&&r_exit){all.get(r_pos).add(num_list.get(0));}
            if (!l_exit&&!r_exit){all.add(num_list);}

        }
        else{
            for (int i=0;i<len;i++){
                if (all.get(i).contains(num_list.get(1))){single_exit=true;single_pos=i;break;}
            }
            if(!single_exit){all.add(new ArrayList<>(Arrays.asList(num_list.get(1))));}
        }


    }
}