package Scaler.DSA2.Sorting3_Coparator_25092023;

import java.util.Arrays;
import java.util.Comparator;

public class FactorSort {
    public static void main(String[] args) {
        int [] A=new int[]{6,8,9};
        Integer[] AInt=new Integer[A.length];
        Arrays.setAll(AInt,i->A[i]);
        Comparator<Integer> compare=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1factor= factorCount(o1);
                int o2Factor=factorCount(o2);
                if(o1factor<o2Factor)
                    return -1;
                else if (o1factor>o2Factor)
                    return 1;
                else{
                    if(o1<o2)
                        return -1;
                    else if (o1>o2)
                        return 1;
                    else
                        return 0;
                }

            }

        };
        Arrays.sort(AInt,compare);
    }
    private static int factorCount(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i==num/i)
                    count++;
                else
                    count+=2;
            }
        }
        System.out.println(count);
        return count;
    }
}
