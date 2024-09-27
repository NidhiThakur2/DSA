package PracticePrograms.Arrays;

import java.util.Arrays;

public class PrefixMax {
    public static void main(String[] args) {
        int []A={1,3,2,6,8,4,10};
        int[]pfm=findPFM(A);
        Arrays.stream(pfm).forEach(System.out::println);
    }

    private static int[] findPFM(int[] a) {
        int []pfm=new int[a.length];
        pfm[0]=a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>pfm[i-1]){
                pfm[i]=a[i];
            }else
                pfm[i]=pfm[i-1];
        }
        return pfm;
    }
}
