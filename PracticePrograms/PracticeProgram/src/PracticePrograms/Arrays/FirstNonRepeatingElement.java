package PracticePrograms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int []A=new int[]{-1, 2, -1, 3, 2};
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        for(int i=0;i<A.length;i++){
            if(hm.get(A[i])==1) {
                System.out.println(A[i]);
                break;
            }
        }
    }
}
