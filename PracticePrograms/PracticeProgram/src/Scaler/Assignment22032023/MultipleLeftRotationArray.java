package Scaler.Assignment22032023;

import java.util.Arrays;

public class MultipleLeftRotationArray {
    public static void main(String[] args) {
        int A[]={123,4,3,2,3,66};
        int B[]={198,2,32};
        int[][]result=new int[B.length][A.length];
        int r=-1,c=-1;
        for(int i=0;i<B.length;i++){
            int k=B[i];
            k=k%A.length;
            r++;c=0;
            for(int j=k;j<A.length;j++){
                result[r][c]=A[j];
                c++;
            }
            for(int j=0;j<=k-1;j++){
                result[r][c]=A[j];
                c++;
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}

