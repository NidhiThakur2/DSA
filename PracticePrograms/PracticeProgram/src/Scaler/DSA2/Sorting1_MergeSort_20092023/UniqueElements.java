package Scaler.DSA2.Sorting1_MergeSort_20092023;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int []A=new int[]{1,1,2,3};
        Arrays.sort(A);
        //Arrays.stream(A).forEach(System.out::println);
        int count=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]) {
                A[i+1]=A[i+1]+1;
                count++;
            }
            else if(A[i]>A[i+1]){
                count+=2;
                A[i+1]=A[i+1]+2;
            }
        }
        System.out.println(count);

    }



}
