package Scaler.MockInterview.DSA;

public class SubArrayWithGivenSumAndLength {
    public static void main(String[] args) {
        int []A=new int[]{1,2,3,4,5,6};
        int B=3,C=100;
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        if(sum==C)
            System.out.println(1);
        else{
            for(int i=B;i<A.length;i++){
                sum=sum+A[i];
                sum=sum-A[i-B];
                if(sum==C) {
                    System.out.println(1);
                    break;
                }
            }
        }
    }
}
