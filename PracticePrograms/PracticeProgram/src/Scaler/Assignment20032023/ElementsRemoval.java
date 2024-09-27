package Scaler.Assignment20032023;

import java.util.Arrays;

public class ElementsRemoval {
    public static void main(String[] args) {
        int []A={2, 1,5,3,6};
        Arrays.sort(A);
        int sum=0;
        for(int i=A.length-1;i>=0;i--){
            System.out.println(A[i]);
            sum=sum+A[i]*(A.length-i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
