package Scaler.Assignment24022023;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int A[]={5, 1, 10, 1};
        int lpa[]=generateLeftProductArray(A);
        int rpa[]=generateRightProductArray(A);
        for(int i=0;i<A.length;i++){
            A[i]=lpa[i]*rpa[i];
        }
        Arrays.stream(A).forEach(System.out::println);
    }
    private static int[] generateRightProductArray(int[] a) {
        int []productArray=new int[a.length];
        productArray[a.length-1]=1;
        for(int i=a.length-2;i>=0;i--){
            productArray[i]=productArray[i+1]*a[i+1];
        }
        return productArray;
    }
    private static int[] generateLeftProductArray(int[] a) {
        int []productArray=new int[a.length];
        productArray[0]=1;
        for(int i=1;i<a.length;i++){
            productArray[i]=productArray[i-1]*a[i-1];
        }
        return productArray;
    }
}
