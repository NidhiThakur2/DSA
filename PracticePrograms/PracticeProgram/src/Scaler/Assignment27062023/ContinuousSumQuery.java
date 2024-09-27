package Scaler.Assignment27062023;

import PracticePrograms.A;

import java.util.ArrayList;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        int A=5;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> t1=new ArrayList<>();
        t1.add(1);
        t1.add(2);
        t1.add(10);
        ArrayList<Integer> t2=new ArrayList<>();
        t2.add(2);
        t2.add(3);
        t2.add(20);
        ArrayList<Integer> t3=new ArrayList<>();
        t3.add(2);
        t3.add(5);
        t3.add(25);
        B.add(t1);
        B.add(t2);
        B.add(t3);
        ArrayList<Integer> result=solve(A,B);
        result.stream().forEach(System.out::println);
    }

    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> pfsum = new ArrayList<Integer>(A);
        for (int i = 0; i < A; i++)
            pfsum.add(0);
        for (int i = 0; i < B.size(); i++) {
            int l = B.get(i).get(0);
            int r = B.get(i).get(1);
            int p = B.get(i).get(2);
            pfsum.set(l - 1, pfsum.get(l - 1) + p);
            if (r != A)
                pfsum.set(r , pfsum.get(r) - p);
        }
        for(int i=1;i<A;i++){
            pfsum.set(i,pfsum.get(i-1)+pfsum.get(i));
        }
        return pfsum;
    }
}
