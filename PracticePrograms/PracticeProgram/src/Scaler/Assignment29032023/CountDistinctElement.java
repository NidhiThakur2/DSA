package Scaler.Assignment29032023;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void main(String[] args) {
        int A[]={3, 3, 3, 9, 0, 1, 0};
        Set<Integer> setA=new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
        }
        System.out.println(setA.size());
    }
}
