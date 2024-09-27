package Scaler.Assignment27032023;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String A="secure";
        String B="rescue";
        char[] chA=A.toCharArray();
        char[] chB=B.toCharArray();
        Arrays.sort(chA);
        Arrays.sort(chB);
        for(int i=0;i<chA.length;i++){
            if(chA[i]!=chB[i]) {
                System.out.println(0);
                break;
            }
        }
        System.out.println(1);


    }
}
