package Scaler.DSA2.Sorting1_MergeSort_20092023;

import java.util.ArrayList;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        ArrayList<Integer> C=new ArrayList<>();
        A.add(4);
        A.add(7);
        A.add(9);
        B.add(2);
        B.add(11);
        B.add(19);

        int i=0,j=0,k=0;
        while(i<A.size() && j<B.size()){
            if(A.get(i)<B.get(j)) {
                C.add(A.get(i));
                i++;
            }else if(A.get(i)==B.get(j)){
                C.add(A.get(i));
                i++;
                j++;
            }else{
                C.add(B.get(j));
                j++;
            }
        }
        while(i<A.size()){
            C.add(A.get(i));
            i++;
        }
        while(j<A.size()){
            C.add(B.get(j));
            j++;
        }
        C.stream().forEach(System.out::println);
    }
}
