package Scaler.Assignment31032023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenXOR {
    public static void main(String[] args) {
        int A[]={1,3,2,4,5,3,10,15,32,34};
        int B=5;
        HashSet<Integer> setA=new HashSet<Integer>();
        HashSet<Integer> XORSet=new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
        }
        int count=0;
        for(int i=0;i<A.length;i++){
            if(!XORSet.contains(A[i])){
                int num=A[i]^B;
                if(setA.contains(num)){
                    count++;
                    XORSet.add(num);
                }
            }
        }
        System.out.println(count);
    }
}
