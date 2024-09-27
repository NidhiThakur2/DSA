package Scaler.Assignment12072023;

import java.util.Arrays;

public class nCr {
    public static void main(String[] args) {
        int A=4,B=3,C=17;
        int[] arr=new int [B+1];
        for(int i=0;i<B+1;i++){
            arr[i]=1;
        }
        for(int i=2;i<=A;i++){
            int []tempArr=arr.clone();
            for(int j=1;j<=B;j++){
                if(i!=j && i>j)
                    tempArr[j]=(arr[j-1]%C+arr[j]%C)%C;
            }
            Arrays.stream(tempArr).forEach(System.out::print);
            arr=tempArr;
            System.out.println();
        }
        int ans=arr[B];
        System.out.println(ans);
    }
}
