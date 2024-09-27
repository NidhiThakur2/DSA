package PracticePrograms.Arrays;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] A = new int[]{6,2};
        int[] B = new int[]{85,25,1,32,54,6};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
                hs.add(A[i]);
        }
        for(int j=0;j<B.length;j++){
            hs.add(B[j]);
        }
        hs.stream().forEach(System.out::println);
    }
}
