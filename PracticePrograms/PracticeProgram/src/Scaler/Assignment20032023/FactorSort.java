package Scaler.Assignment20032023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FactorSort {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList();
        A.add(6);
        A.add(8);
        A.add(9);
        Collections.sort(A,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                int factor1=factorCount(o1);
                int factor2=factorCount(o2);
                if(factor1!=factor2)
                    return factor1-factor2;
                return o1-o2;
            }
        });
    }
    private static int factorCount(Integer A){
        int count=0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0) {
                if (i == A/i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }
}

