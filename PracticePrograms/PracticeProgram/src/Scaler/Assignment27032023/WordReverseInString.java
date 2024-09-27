package Scaler.Assignment27032023;

import java.util.Arrays;

public class WordReverseInString {
    public static void main(String[] args) {
        String A="the sky is blue";
        String []str=A.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
