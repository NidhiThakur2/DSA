package Scaler.Assignment20032023;

import java.util.Arrays;
import java.util.Collections;

public class SortByColor {
    public static void main(String[] args) {
        int A[]={2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2 };
        int redTotal=0,whiteTotal=0,blueTotal=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0)
                redTotal++;
            if(A[i]==1)
                whiteTotal++;
            if(A[i]==2)
                blueTotal++;
        }
        int redCount=0,whiteCount=0,blueCount=0;
        for(int i=0;i<A.length;i++){
            if(redCount!=redTotal){
                A[i]=0;
                redCount++;
            }else{
                if(whiteCount!=whiteTotal){
                    A[i]=1;
                    whiteCount++;
                }else{
                    if(blueCount!=blueTotal) {
                        A[i] = 2;
                        blueCount++;
                    }
                }
            }
        }
        Arrays.stream(A).forEach(System.out::println);


    }
}
