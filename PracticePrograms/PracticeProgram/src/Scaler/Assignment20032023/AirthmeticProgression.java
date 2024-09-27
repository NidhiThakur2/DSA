package Scaler.Assignment20032023;

import java.util.Arrays;
import java.util.Collections;

public class AirthmeticProgression {
    public static void main(String[] args) {
        int A[]={-9876,675635,765473,-1232};
        int isAP=1;
        Arrays.sort(A);
        int def=A[1]-A[0];
        for(int i=1;i<A.length-1;i++){
            if(A[i+1]-A[i]!=def){
                isAP=0;
                break;
            }
        }
        System.out.println(isAP);

    }
}
