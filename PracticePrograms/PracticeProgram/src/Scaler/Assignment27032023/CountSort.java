package Scaler.Assignment27032023;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int A[]={10,10,9,8};
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        int frequency[]=new int[max];
        for(int i=0;i<A.length;i++){
            frequency[A[i]-1]=frequency[A[i]-1]+1;
        }
       for(int i=0,j=0;i<=frequency.length-1;i++){
           while(frequency[i]>0){
               A[j]=i+1;

               j++;
               frequency[i]--;
           }

       }
        Arrays.stream(A).forEach(System.out::println);
    }
}
