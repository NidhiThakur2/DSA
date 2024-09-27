package Scaler.Assignement21072023;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int A[]=new int[] {2,4,5};
        Arrays.sort(A);
        int steps=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>=A[i+1])
                steps=steps+(A[i]-A[i+1])+1;
            A[i+1]=A[i]+1;
        }
        System.out.println(steps);
    }
}
