package PracticePrograms.Recursion.BackTracking;

import java.util.Arrays;

public class BinaryStringOfNDigits {
    static int[] A=new int[3];
    public static void main(String[] args) {
        int N=3;
        binary(N);
    }

    private static void binary(int n) {
        if(n<1) {
            Arrays.stream(A).forEach(System.out::print);
            System.out.println();
        }
        else{
            A[n-1]=0;
            binary(n-1);
            A[n-1]=1;
            binary(n-1);
        }
    }
}
