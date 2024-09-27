package PracticePrograms.Arrays;

import java.util.Arrays;

public class SufixMax {
    public static void main(String[] args) {
        int []A={2,5,6,1,11,8,9};
        int[]sfm=findSFM(A);
        Arrays.stream(sfm).forEach(System.out::println);
    }
    private static int[] findSFM(int[] a) {
        int n=a.length;
        int []sfm=new int[a.length];
        sfm[n-1]=a[n-1];
        for(int i=n-2;i>0;i--){
            if(a[i]>sfm[i+1])
                sfm[i]=a[i];
            else
                sfm[i]=sfm[i+1];
            }
        return sfm;
        }
    }
