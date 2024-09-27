package Scaler.Assignment9032023;

import java.util.Arrays;

public class EvenIndicesSum {
    public static void main(String[] args) {
        int[]A={1, 2, 3, 4, 5};
        int Q[][]={{0,2},{1,4}};
        int evenSum[]= new int[Q.length];
        findPrefixSumEven(A);
        Arrays.stream(A).forEach(System.out::print);
        System.out.println();
        for(int i=0;i<Q.length;i++){
            int l=Q[i][0];
            int r=Q[i][1];
            if(i==0)
                evenSum[i]=A[r];
            else
                evenSum[i]=A[r]-A[l-1];
        }
        Arrays.stream(evenSum).forEach(System.out::println);
    }
    private static void findPrefixSumEven(int[] A) {
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                A[i]=A[i-1]+A[i];
            }else
                A[i]=A[i-1];
        }
    }
}
