package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        dfs(nums,result,0,new ArrayList<Integer>());
   //     result.stream().forEach(System.out::println);
    }

    private static void dfs(int[] input, ArrayList<ArrayList<Integer>> output, int s, ArrayList<Integer> subset) {
        output.add(new ArrayList<>(subset));
        System.out.println(output);
        for(int i=s;i<input.length;i++){
            subset.add(input[i]);
            dfs(input,output,i+1,subset);
            subset.remove(subset.size()-1);
            System.out.println(subset);
        }
    }
}
