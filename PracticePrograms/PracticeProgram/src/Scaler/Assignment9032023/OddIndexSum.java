package Scaler.Assignment9032023;

import java.util.Arrays;

public class OddIndexSum {
    public static void main(String[] args) {
        int[]A={2, 1, 8, 3, 9};
        int Q[][]={{0,3},{2,4}};
        int oddSum[]= new int[Q.length];
        findPrefixSumOdd(A);
        Arrays.stream(A).forEach(System.out::print);
        System.out.println();
        for(int i=0;i<Q.length;i++){
            int l=Q[i][0];
            int r=Q[i][1];
            if(l==0)
                oddSum[i]=A[r];
            else
                oddSum[i]=A[r]-A[l-1];
        }
        Arrays.stream(oddSum).forEach(System.out::println);
    }

    private static void findPrefixSumOdd(int[] A) {
        A[0]=0;
        for(int i=1;i<A.length;i++){
            if(i%2!=0){
                A[i]=A[i-1]+A[i];
            }else
                A[i]=A[i-1];
        }
    }
}
