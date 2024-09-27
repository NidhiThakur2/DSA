package Scaler.Assignment17032023;

import java.util.Arrays;

public class DivisibleBy8 {
    public static void main(String[] args) {
        String str = "1236";
        int number = 0;
        if(str.length()>2){
            number=Integer.parseInt(str.substring(str.length()-3,str.length()));
        }else
            number=Integer.parseInt(str);
        System.out.println(number);
        if(number%8==0)
            System.out.println(1);
        else
            System.out.println(0);


    }
}
