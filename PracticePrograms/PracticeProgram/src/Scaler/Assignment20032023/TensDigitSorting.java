package Scaler.Assignment20032023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TensDigitSorting {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(24);
        A.add(22);
        A.add(19);
        A.add(29);
        //A.stream().forEach(System.out::println);
        Collections.sort(A,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                int num1=(o1/10)%10;
                int num2=(o2/10)%10;
                if(num1!=num2)
                    return num1-num2;
                else {
                    if (o1 > o2)
                        return -1;
                    else
                        return 1;
                }

            }
        });
        A.stream().forEach(System.out::println);
    }
}
