package Scaler.DSA4.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class OIKnapsack {
    public static void main(String[] args) {
        int []A=new int[]{377,932,309,945,440,627,324,538,539,119,83,930,542,834,116,640,659,705,931,978,307,674,387,22,746,925,73,271,830,778,574,98,513,987,291,162,637,356,768,656,575,32,53,351,151,942,725,967,431,108,192,8,338,458,288,754,384,946,910,210,759,222,589,423,947,507,31};
        int[]B=new int[]{114,19,1,42,13,6,11,10,25,38,49,34,46,42,3,1,42,37,25,21,47,22,49,50,19,35,32,35,4,50,19,39,1,39,28,18,29,44,49,34,8,22,11,18,14,15,10,17,36,2,1,50,20,7,49,4,25,9,45,10,40,3,46,36,44,44,24};
        int C=10;
        int n=A.length;
        int dp[][]=new int[A.length][C+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=o1Knapsack(dp,A,B,n-1,C);

        System.out.println(ans);
    }

    private static int o1Knapsack(int [][]dp,int[] a, int[] b, int end, int remainingWeight) {
        if(end==0){
            if(b[end]<=remainingWeight){
                dp[end][remainingWeight]=a[end];
                 return a[end];
            }
            return 0;
        }
        if(remainingWeight<=0){
            return 0;
        }
        if(dp[end][remainingWeight]!=-1)
            return dp[end][remainingWeight];
        else {
            int include=0;
            if (remainingWeight >= b[end])
                include = a[end] + o1Knapsack(dp, a, b, end - 1, remainingWeight - b[end]);
            int exclude = o1Knapsack(dp, a, b, end - 1, remainingWeight);
            dp[end][remainingWeight] = Math.max(include, exclude);
        }
        return dp[end][remainingWeight] ;
    }

}
