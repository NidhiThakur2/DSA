package Scaler.Assignment1032023;

import java.util.Arrays;

public class GenerateSubArrays {
    public static void main(String[] args) {
        int []A={36, 63, 63, 26, 87, 28, 77, 93, 7 };
        int rows=(A.length*(A.length+1))/2;
        int col=A.length;
        int [][]subArrays=new int[rows][col];
        int c=0;
        for(int i=0;i<A.length;i++){
           for(int j=i;j<A.length;j++){
               int d=0;
                for(int k=i;k<=j;k++) {
                    subArrays[c][d] = A[k];
                    d++;
                             // System.out.print(subArrays[i][k]+" ");
                }
                c++;
              //  System.out.println();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(subArrays[i][j]);
            }
            System.out.println();
        }


    }
}
