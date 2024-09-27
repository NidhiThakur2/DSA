package Scaler.Assignment24022023;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int []A={2, 2, 2};
        int [][]B={{0, 0}, {1, 2}};
            generatePrefixArray(A);
        //Arrays.stream(A).forEach(System.out::println);
        int result[]=findRangeSum(A,B);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static void generatePrefixArray(int[] a) {
        for(int i=1;i<a.length;i++)
            a[i]=a[i-1]+a[i];
    }

    private static int[] findRangeSum(int[] a, int[][] b) {
        int result[]=new int[b.length];
        for(int i=0;i<b.length;i++){
            int l=b[i][0];
            int r=b[i][1];
            if(l==0)
                result[i]=a[r];
            else
                result[i]=a[r]-a[l-1];
        }
        return result;
    }
}
