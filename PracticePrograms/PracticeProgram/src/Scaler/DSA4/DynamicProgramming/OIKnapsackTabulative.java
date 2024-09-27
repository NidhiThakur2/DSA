package Scaler.DSA4.DynamicProgramming;

public class OIKnapsackTabulative {
    public static void main(String[] args) {
        int []A=new int[]{6, 10, 12};
        int []B=new int[]{10, 20, 30};
        int C=50;
        int []dp=new int[C+1];
        int n = A.length;


        for (int i = 1; i <= n; i++) {
            for (int j = C; j >= B[i - 1]; j--) {
                dp[j] = Math.max(A[i - 1] + dp[j - B[i - 1]], dp[j]);
            }
        }


        System.out.println(dp[C]);
    }
}
