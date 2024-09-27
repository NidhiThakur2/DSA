package Scaler.Assignment220223;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int []A={2, 5, 6};
        int i=0,j=2;
        while(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        Arrays.stream(A).forEach(System.out::println);

    }
}
