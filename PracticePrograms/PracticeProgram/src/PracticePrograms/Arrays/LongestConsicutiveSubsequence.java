package PracticePrograms.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsicutiveSubsequence {
    public static void main(String[] args) {
        int[] A = new int[]{2, 8, 10, 9, 11, 12, 3};
        int ans = bruteForce(A);
        int ans1=optimizedSorting(A);
        int ans2=optimizedHashing(A);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static int optimizedHashing(int[] a) {
        if(a.length==0)
            return 0;
        return longestSubsequenceOptimizedHashing(a);
    }

    private static int longestSubsequenceOptimizedHashing(int[] a) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int ans=Integer.MIN_VALUE;
        for(Integer num:hs){
            int count=1;
            int x=num+1;
            while(hs.contains(x)){
                count++;
                x+=1;
            }
            ans=Integer.max(count,ans);
            count=1;
        }
        return ans;
    }

    private static int optimizedSorting(int[] a) {
        if(a.length==0)
            return 0;
        return longestSubsequenceOptimizedSorting(a);
    }

    private static int longestSubsequenceOptimizedSorting(int []a) {
        Arrays.sort(a);
        int count=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            int x=a[i]+1;
            if(x==a[i+1]){
                count++;
                ans=Integer.max(ans,count);
            }else{
                count=1;
            }
        }
        return ans;
    }

    private static int bruteForce(int []a) {
        if(a.length==0)
            return 0;
        return longestSubsequence(a);
    }

    private static int longestSubsequence(int[] a) {
        int ans=1;
        for(int i=0;i<a.length;i++) {
            int x = a[i] + 1;
            int len = 1;
            while (search(x, a) == true) {
                len += 1;
                x += 1;
            }
            ans=Integer.max(ans,len);
        }
        return ans;
    }

    private static boolean search(int x, int[] a) {
        for(int i=0;i<a.length;i++){
            if(x==a[i])
                return true;
        }
        return false;
    }
}
