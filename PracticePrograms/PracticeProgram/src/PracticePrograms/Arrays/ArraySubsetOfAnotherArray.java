package PracticePrograms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int []A1=new int[]{11, 7, 1, 13, 21, 3, 8, 3};
        int []A2=new int[]{11, 3, 7, 1, 7};
        Map<Integer,Integer> hm=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<A1.length;i++){
            hm.put(A1[i],hm.getOrDefault(A1[i],0)+1);
        }
        for(int i=0;i<A2.length;i++){
            int freq=hm.get(A2[i]);
            if(freq>0){
                hm.put(A2[i],hm.get(A2[i])-1);
            }else{
                ans=false;
                break;
            }
        }
        System.out.println(ans);


    }
}

