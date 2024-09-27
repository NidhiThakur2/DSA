package Scaler.Assignment10072023;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPrimes {
    public static void main(String[] args) {
        int A=7;
        boolean []num=new boolean [A+1];
        Arrays.fill(num,true);
        for(int i=2;i*i<=A;i++){
            if(num[i]==true){
                for(int j=i*i;j<=A;j+=i){
                    num[j]=false;
                }
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=2;i<=A;i++){
           if(num[i]==true)
               result.add(i);
        }
        result.stream().mapToInt(i->i).toArray();

    result.stream().forEach(System.out::println);

    }
}
