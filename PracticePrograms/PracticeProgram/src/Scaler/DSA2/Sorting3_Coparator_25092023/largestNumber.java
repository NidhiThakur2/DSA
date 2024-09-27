package Scaler.DSA2.Sorting3_Coparator_25092023;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {
    public static void main(String[] args) {
        int[] A=new int[]{3,30,34,5,9};
        Integer[] AInt = new Integer[A.length];

        Arrays.setAll(AInt, i -> A[i]);
        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String x=o1.toString();
                String y=o2.toString();
                String xy=x.concat(y);
                String yx=y.concat(x);
                if(xy.compareTo(yx)<0)
                    return 1;
                else
                    return -1;

            }
        };
        Arrays.sort(AInt,comp);
        Arrays.stream(AInt).forEach(System.out::println);
        StringBuilder ans=new StringBuilder("");
        int sum=0;
        for(int i=0;i<AInt.length;i++){
            sum+=AInt[i];
            ans.append(AInt[i]);
        }
        if(sum==0)
            ans=new StringBuilder("0");
        System.out.println(ans.toString());
    }
}
