package Scaler.Contest;

import java.util.Arrays;

public class ThreeFactor {
    public static void main(String[] args) {
        int A[]={11,18,2,7,15};
        int B[][]={{2,3},{1,5},{3,4}};
        int pfc[]=new int [A.length];
        int result[]=new int[B.length];
        isPrime(A);
        pfc[0]=A[0];
        for(int i=1;i<A.length;i++){
            pfc[i]=pfc[i-1]+A[i];
        }
        for(int i=0;i<B.length;i++){
            int l=B[i][0];
            int r=B[i][1];
            if(l-1==0)
                result[i]=pfc[r-1];
            else
                result[i]=pfc[r-1]-pfc[(l-1)-1];
        }
        Arrays.stream(result).forEach(System.out::println);
    }
    private static void isPrime(int []A){
        boolean isPrime=true;
        for(int i=0;i<A.length;i++){
            if(A[i]==1 || A[i]==2) {
                A[i]=0;
            }
            else{
                isPrime=true;
                for(int j=2;j*j<=A[i];j++){
                    if(A[i]%j==0){
                        A[i]=1;
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime)
                    A[i]=0;
            }

        }
    }
}

