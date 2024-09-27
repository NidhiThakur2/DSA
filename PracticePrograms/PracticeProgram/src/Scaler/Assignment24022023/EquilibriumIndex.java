package Scaler.Assignment24022023;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int A[]={1, 2, 3, 7, 1, 2, 3};
        long a[]=generatePrefixArray(A);
        //Arrays.stream(a).forEach(System.out::println);
        int equilibriumIndex=solve(a);
        System.out.println(equilibriumIndex);
    }

    public static int solve(long[] a) {
        int index=-1;
        for(int i=1;i<a.length;i++){
            long lhs=a[i-1];
            long rhs=a[a.length-1]-a[i];
            if(lhs==rhs)
                return i;
        }
        return index;
    }
    private static long[] generatePrefixArray(int[] a) {
        long A[]=new long[a.length];
        A[0]=a[0];
        for(int i=1;i<a.length;i++){
            A[i]=A[i-1]+a[i];
            System.out.println(a[i-1]+"+"+a[i]+"="+A[i]);
                 }
        return A;
    }
}
