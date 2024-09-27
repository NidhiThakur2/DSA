package PracticePrograms.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int []A=new int[]{6,1,2,8,3,4,7,10,5};
        cyclicSort(A);
        Arrays.stream(A).forEach(System.out::println);

    }

    private static void cyclicSort(int[] a) {
        for(int i=0;i<a.length;){
            if(a[i]==i+1)
                i++;
            else {
                int temp1 = a[i];
                int temp2 = a[a[i] - 1];
                a[i]=temp2;
                a[temp1-1]=temp1;
            }
        }
    }
}
