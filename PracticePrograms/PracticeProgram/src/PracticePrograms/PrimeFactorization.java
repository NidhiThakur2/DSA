package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        int number=12;
        int i=2;
        List<Integer> primeFactor=new ArrayList<>();
        while(number!=1){
            if(number%i==0){
                number=number/i;
                primeFactor.add(i);
            }else{
                i=nextPrime(i+1);
            }
        }
        primeFactor.stream().forEach(num-> System.out.println(num));
    }

    private static int nextPrime(int num) {
        while(true){
            int temp=num;
            for(int i=2;i<=num/2;i++){
                if(temp%i==0) {
                    temp++;
                    break;
                }
            }
            if(temp==num)
                return num;
            else
                num=temp;
        }
    }
}
