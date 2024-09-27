package Scaler.Assignment1572023;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoi {
    static ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        int A=3;
        toh(A,1,2,3);
        result.stream().forEach(System.out::println);
    }

    private static void toh(int a, int i, int i1, int i2) {
        if(a==0)
            return;
        toh(a-1,i,i2,i1);
        ArrayList<Integer> subList=new ArrayList<>();
        subList.add(a);
        subList.add(i);
        subList.add(i2);
        result.add(subList);
        toh(a-1,i1,i,i2);
    }
}
