package Scaler.Assignment220223;

import java.util.Arrays;

public class ArrayReverse1 {
    public static void main(String[] args) {
        final int []A={1,1,10};
        int[]B=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        Arrays.stream(B).forEach(System.out::println);
    }
}
