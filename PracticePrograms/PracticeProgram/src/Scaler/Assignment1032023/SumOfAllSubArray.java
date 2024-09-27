package Scaler.Assignment1032023;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int []A={2, 1, 3};
        long sum=0;
        for(int i=0;i<=A.length-1;i++){
            long contribution=(long)(i+1)*(long)(A.length-i);
            sum+=A[i]*contribution;
        }
        System.out.println(sum);

    }
}
