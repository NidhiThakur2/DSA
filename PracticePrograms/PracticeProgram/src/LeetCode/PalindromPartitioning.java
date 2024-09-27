package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PalindromPartitioning {
    public static void main(String[] args) {
        String s="aaab";
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        dfs(s,ans,0,new ArrayList<>());
       // ans.stream().forEach(System.out::println);
    }

    private static void dfs(String input, ArrayList<ArrayList<String>> ans, int start, ArrayList<String> subsets) {
        if(start==input.length()){
            ans.add(new ArrayList<>(subsets));
            ans.stream().forEach(System.out::println);
            return;
        }
        for(int i=start;i<input.length();i++){
            if(isPalindrom(input,start,i)){
                subsets.add(input.substring(start,i+1));
                dfs(input,ans,i+1,subsets);
                subsets.remove(subsets.size()-1);
            }
        }

    }

    private static boolean isPalindrom(String s, int l, int r) {
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        return true;
    }
}
