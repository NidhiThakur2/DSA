package Scaler.DSA4.DynamicProgramming;

public class UniqueBinarySearchTree {
    public static void main(String[] args) {
        int A=5;
        int ans=1;
        if(A<1) {
            System.out.println(ans);
        }else{
            int []dp=new int[A+1];
            dp[0]=1;
            dp[1]=1;
            for(int i=2;i<=A;i++){
                for(int j=1;j<=i;j++){
                    dp[i]+=dp[j-1]*dp[i-j];
                }
            }
            ans=dp[A];
            System.out.println(ans);
        }
    }
}
