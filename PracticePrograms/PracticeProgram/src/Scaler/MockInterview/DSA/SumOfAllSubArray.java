package Scaler.MockInterview.DSA;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int []A=new int[]{1,2,3,4,5};
        int sum=0;
        int n=A.length;
        //Contribution of A[i] in number of sub arrays
        for(int i=0;i<n;i++){
           int factor=(n-i)*(i+1);
           A[i]*=factor;
           sum+=A[i];
        }
        System.out.println(sum);
    }
}
