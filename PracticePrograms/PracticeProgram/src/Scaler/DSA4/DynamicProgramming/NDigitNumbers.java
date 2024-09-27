package Scaler.DSA4.DynamicProgramming;

import java.util.ArrayList;
public class NDigitNumbers {
    public static void main(String[] args) {
        int A=2,B=4;
        int ans=0;
        int [][]dp=new int[A+1][B+1];
        for(int i=0;i<=A;i++)
        {
            for(int j=0;j<=B;j++)
            {
                dp[i][j]=-1;
            }
        }
        for(int i=1;i<10;i++){
            ans+=countNumber(dp,A-1,B-i);
            ans%=1000000007;
        }
        System.out.println(ans);
    }

    private static int countNumber(int[][] dp, int a, int sum) {
        if(sum<0) return 0;
        if(a==0 && sum==0) return 1;
        if(a==0) return 0;
        if(dp[a][sum]!=-1)
            return dp[a][sum];
        int ans=0;
        for(int i=0;i<10;i++) {
            ans += countNumber(dp, a - 1, sum - i);
            ans %= 1000000007;
        }
        dp[a][sum]=ans;
        return ans;
    }
}
