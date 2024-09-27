package Scaler.Assignment27032023;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []A={"abcdefgh", "abcfghijkjjjjj", "abcefgh"};
        Arrays.sort(A);
        StringBuilder sb=new StringBuilder(A[0]);
        while(sb.length()>0){
            int count=0;
            for(int i=1;i<A.length;i++){
                if(A[i].startsWith(sb.toString())){
                    count++;
                }
            }
            if(count==A.length-1){
                break;
            }else{
                sb=new StringBuilder(sb.substring(0,sb.length()-1));
            }
        }
        System.out.println(sb.toString());
    }
}
