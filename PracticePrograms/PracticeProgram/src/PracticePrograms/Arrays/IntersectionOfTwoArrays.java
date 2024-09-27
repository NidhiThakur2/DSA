package PracticePrograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int []A=new int[]{3,4,6,2,8,5,9};
        int []B=new int[]{6,3,2,7,5,1};
        ArrayList<Integer> intersection=new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0,j=0;
        while(i<A.length && j<B.length){
            if(A[i]==B[j]){
                intersection.add(A[i]);
                i++;
                j++;
            }else if(A[i]<B[j]){
                intersection.add(A[i]);
                i++;
            }else{
                intersection.add(B[j]);
                j++;
            }

        }
        intersection.stream().forEach(System.out::println);
    }
}
