package Scaler.DSA4.DynamicProgramming;

public class FlipArray {
    public static void main(String[] args) {
        int[]A=new int[]{15, 10, 6};
        int sum=0;
        for(int i=0;i<A.length;i++)
            sum+=A[i];
        sum=sum/2;
        int []dp=new int[sum+1];
        for(int i=1;i<=sum;i++){
            dp[i]=99999;
        }
        for(int i=1;i<=A.length;i++){
            for(int j=sum;j>=0;j--){
               int donotFlip=dp[j];
               int flip=0;
               if(A[i-1]<=j)
                flip=dp[j-A[i-1]]+1;
               dp[j]=Math.min(donotFlip,flip);
            }
        }
        while(dp[sum]==99999)
        {
            sum--;
        }
        System.out.println(dp[sum]);

    }
}
