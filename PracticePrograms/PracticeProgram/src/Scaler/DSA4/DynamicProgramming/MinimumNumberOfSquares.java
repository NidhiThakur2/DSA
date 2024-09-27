package Scaler.DSA4.DynamicProgramming;

public class MinimumNumberOfSquares {
    public static void main(String[] args) {
        int count=12;
        int []dp=new int[count+1];
        for(int i=0;i<dp.length;i++)
            dp[i]=Integer.MAX_VALUE;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=count;i++){
            for(int k=1;k*k<=i;k++){
                dp[i]=Integer.min(dp[i],dp[i-k*k]+1);

            }
        }
        System.out.println(dp[count]);
    }
}
