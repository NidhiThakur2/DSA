package Scaler.DSA4.DynamicProgramming;

public class RodCutting {
    public static void main(String[] args) {
        int[]A=new int[]{3, 4, 1, 6, 2};
        int n=A.length;
        int[]dp=new int[A.length+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<=i;j++){
                max=Math.max(max,A[j-1]+dp[i-j]);
            }
            dp[i]=max;
        }
        System.out.println(dp[n]);
    }
}
