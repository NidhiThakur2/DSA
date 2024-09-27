package Scaler.DSA4.DynamicProgramming;

public class UniquePathInGrid {
    public static void main(String[] args) {
        int [][]A=new int[][]{{0,1}};
        int row=A.length,col=A[0].length;
        int [][]dp=new int[A.length][A[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (i==0 || j==0) {
                    if (i == 0 && j == 0)
                        dp[i][j] = 1;
                    else if (i == 0 && A[i][j - 1] == 1)
                        dp[i][j] = 0;

                    else if (j == 0 && A[i - 1][j] == 1)
                        dp[i][j] = 0;
                    else{
                        if(A[i][j]==0)
                            dp[i][j]=1;
                        else
                            dp[i][j]=0;
                    }
                }
                else if(A[i][j-1]==1)
                        dp[i][j]=dp[i-1][j];
                else if(A[i-1][j]==1)
                        dp[i][j]=dp[i][j-1];
                else
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];

            }
        }
        System.out.println(dp[row-1][col-1]);
    }
}
