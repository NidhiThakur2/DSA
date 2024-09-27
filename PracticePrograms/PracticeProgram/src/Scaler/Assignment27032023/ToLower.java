package Scaler.Assignment27032023;

import java.util.Arrays;

public class ToLower {
    public static void main(String[] args) {
        String str="ADJFVBFHssdrA";
        char[] A=str.toCharArray();
        for(int i=0;i<A.length;i++){
            int num=A[i];
            if(num>=65 && num<=90){
               num=num^(1<<5);
               A[i]=(char)num;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
