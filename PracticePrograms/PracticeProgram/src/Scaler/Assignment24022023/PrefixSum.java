package Scaler.Assignment24022023;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int []A={0, 999, 3, 4, 5};
        for(int i=1;i<A.length;i++){
            A[i]=A[i-1]+A[i];
        }
        Arrays.stream(A).forEach(System.out::println);
    }
}
