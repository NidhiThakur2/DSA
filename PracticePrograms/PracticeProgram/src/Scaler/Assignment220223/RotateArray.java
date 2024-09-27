package Scaler.Assignment220223;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int []A={2, 5, 6};
        int B=1;
        if(B>=A.length){
            B=B%A.length;
        }
        reverse(A,0,A.length-1);
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
        Arrays.stream(A).forEach(System.out::println);
    }
    private static void reverse(int []A,int i,int j){
        while(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }

    }
}
