package Scaler.Assignment1032023;

import java.util.Arrays;

public class PrintSubArrayRange {
    public static void main(String[] args) {
        int []A={4,5};
        int B=0,C=1;
        int []SA=new int[C-B+1];
        for(int i=B,j=0;i<=C;i++,j++){
            SA[j]=A[i];
        }
        Arrays.stream(SA).forEach(System.out::println);


    }
}
