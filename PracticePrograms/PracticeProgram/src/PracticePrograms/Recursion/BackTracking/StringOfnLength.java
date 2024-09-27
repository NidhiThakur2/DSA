package PracticePrograms.Recursion.BackTracking;

import java.util.Arrays;

public class StringOfnLength {
    static int[]A=new int[3];
    public static void main(String[] args) {
        int k=2;
        formString(3,2);


    }

    private static void formString(int n, int k) {
        if(n<1){
            Arrays.stream(A).forEach(System.out::print);
            System.out.println();
            return;

        }
        for(int i=0;i<k;i++){
            A[n-1]=i;
            formString(n-1,k);
        }

    }
}
