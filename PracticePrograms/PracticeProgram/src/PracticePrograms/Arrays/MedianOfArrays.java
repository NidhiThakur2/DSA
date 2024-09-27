package PracticePrograms.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MedianOfArrays {
    public static void main(String[] args) {
        Integer[] array1=new Integer[]{1,2,3,4};
        Integer[] array2=new Integer[]{5,6};

        Integer[] mergedArray= Stream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().toArray(Integer[]::new);
        Arrays.stream(mergedArray).forEach(System.out::println);
        int i=0,j=mergedArray.length-1;
        while(j>i){
            i++;
            j--;
        }
        if(i==j)
            System.out.println(mergedArray[i]);
        if(j<i) {
            System.out.println(mergedArray[i]);
            System.out.println(mergedArray[j]);
            System.out.println((double) (mergedArray[i] + mergedArray[j]) / 2);
        }

    }
}
