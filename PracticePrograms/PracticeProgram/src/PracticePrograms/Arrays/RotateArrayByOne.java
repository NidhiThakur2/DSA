package PracticePrograms.Arrays;

import java.util.Arrays;

//import static PracticePrograms.Arrays.NegativeNumbersToEnd.reverse;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int []A=new int[]{3,2,4,5,6,9};
        int k=2;
        if(k>=A.length)
            k=k%A.length;
        reverse(A,0,A.length-1);
        reverse(A,0,k-1);
        reverse(A,k,A.length-1);
        Arrays.stream(A).forEach(System.out::println);
    }

    private static void reverse(int[] a, int i, int length) {
        while(i<length){
            int temp=a[i];
            a[i]=a[length];
            a[length]=temp;
            i++;
            length--;
        }
    }
}
