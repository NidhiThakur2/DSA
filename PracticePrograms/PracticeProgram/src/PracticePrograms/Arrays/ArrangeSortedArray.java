package PracticePrograms.Arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrangeSortedArray {
    public static void main(String[] args) {
        Integer[] array=new Integer[]{1,2,3,4,5,6,7};
        Arrays.stream(array).map(i->{
            if(i<array.length-1)
                if (i-1 % 2 == 0) {
                    if (array[i-1] <= array[i]) {
                        int temp = array[i-1];
                        array[i-1] = array[i];
                        array[i] = temp;
                    }
                } else {
                    if (array[i-1] >= array[i]) {
                        int temp = array[i-1];
                        array[i-1] = array[i];
                        array[i] = temp;
                    }
                }
                return array[i-1];
        }).forEach(System.out::println);
    }
}
