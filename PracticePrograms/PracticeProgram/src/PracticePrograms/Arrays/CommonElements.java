package PracticePrograms.Arrays;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int []A=new int[]{1, 5, 10, 20, 40, 80};
        int []B=new int []{6, 7, 20, 80, 100};
        int []C=new int[]{3, 4, 15, 20, 30, 70, 80, 120};
        int minLength=Math.min(A.length,Math.min(B.length,C.length));
        Map<Integer,Integer> hm=new HashMap<>();
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<A.length;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        for(int i=0;i<B.length;i++){
            if(hm.containsKey(B[i]))
                ans.add(B[i]);
        }
        for(int i=0;i<C.length;i++){
            if(hm.containsKey(C[i]))
                ans.add(C[i]);
        }
        ans.stream().forEach(System.out::println);
    }
}
