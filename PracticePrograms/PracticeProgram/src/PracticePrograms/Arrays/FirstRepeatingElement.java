package PracticePrograms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int []A=new int[]{1, 1, 5, 4, 3, 5, 6};
        Map<Integer,Integer> hm=new HashMap<>();
        int firstOccurance=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i]) && hm.get(A[i])<firstOccurance){
               firstOccurance=hm.get(A[i]);
            }
            hm.put(A[i],i+1);
        }
        System.out.println(firstOccurance);
    }
}
