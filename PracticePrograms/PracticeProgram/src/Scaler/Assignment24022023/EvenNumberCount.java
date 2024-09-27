package Scaler.Assignment24022023;

import java.util.Arrays;

public class EvenNumberCount {
    public static void main(String[] args) {
        int A[]={3};
        int B[][]={ {0, 0},
                {0, 0},
                {0, 0},
                {0, 0}};
        generateEvenPrefixArray(A);
        Arrays.stream(A).forEach(System.out::println);
        int evenCount[]=findEvenCount(A,B);
        Arrays.stream(evenCount).forEach(System.out::println);
    }

    private static int[] findEvenCount(int[] a, int[][] b) {
        int []evenCount=new int[b.length];
        for(int i=0;i<b.length;i++){
            int l=b[i][0];
            int r=b[i][1];
            if(l==0 && r==0)
                evenCount[i]=a[l];
            else if(l==0 && r!=0){
                evenCount[i]=a[r];
            }else{
                evenCount[i]=a[r]-a[l-1];
            }
        }
        return evenCount;
    }

    private static void generateEvenPrefixArray(int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                a[i]=1;
            else
                a[i]=0;
            if(i==0)
                a[i]=a[i];
            else
                a[i]=a[i-1]+a[i];
        }

    }
}
