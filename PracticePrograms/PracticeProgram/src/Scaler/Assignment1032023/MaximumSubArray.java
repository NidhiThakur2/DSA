package Scaler.Assignment1032023;

public class MaximumSubArray {
    public static void main(String[] args) {
        //int C[]={50,12,3,4,5,10,3,6,40,12};
        int C[]={1};
        int A=1;
        int B=1;
        int maxSum=findMaxSum(A,B,C);
        System.out.println(maxSum);

    }

    private static int findMaxSum(int A, int B, int[] C) {
        int sum =0, max=sum;
        for(int i=0;i<A;i++){
            sum=0;
            for(int j=i;j<A;j++){
                sum=sum+C[j];
                if(sum<=B){
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        return max;
    }
}
