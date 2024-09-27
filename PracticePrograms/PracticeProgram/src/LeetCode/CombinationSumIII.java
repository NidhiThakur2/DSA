package LeetCode;

import java.util.ArrayList;

public class CombinationSumIII {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    static ArrayList<Integer> combinations=new ArrayList<>();
    static int combinationLength;

    public static void main(String[] args) {
        int k=3,n=9;
        combinationLength=k;
        searchCombination(1,n);
        ans.stream().forEach(System.out::println);
    }

    private static void searchCombination(int i, int sum) {
        if(sum==0) {
            if(combinations.size()==combinationLength){
                ans.add(new ArrayList<>(combinations));
            }
            return ;
        }
        if(i>9 || i>sum || combinations.size()>=combinationLength)
            return;
        combinations.add(i);
        searchCombination(i+1,sum-i);
        combinations.remove(combinations.size()-1);
        searchCombination(i+1,sum);
    }
}
