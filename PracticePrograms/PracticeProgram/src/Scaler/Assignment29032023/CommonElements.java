package Scaler.Assignment29032023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public static void main(String[] args) {
        int A[]={2, 1, 4, 10, 10};
        int B[]={3, 6, 2, 10};
        int length=0;
        if(A.length>=B.length)
            length=B.length;
        else
            length=A.length;
        ArrayList<Integer> result=new ArrayList<Integer>();
        Map<Integer,Integer> frequencyA=new HashMap<Integer,Integer>();
        Map<Integer,Integer> frequencyB=new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++){
            if(frequencyA.containsKey(A[i]))
                frequencyA.put(A[i],frequencyA.get(A[i])+1);
            else
                frequencyA.put(A[i],1);
        }
        for(int i=0;i<B.length;i++){
            if(frequencyB.containsKey(B[i]))
                frequencyB.put(B[i],frequencyB.get(B[i])+1);
            else
                frequencyB.put(B[i],1);
        }
        Map<Integer,Integer> searchMap=null;
        for(Integer key:frequencyA.keySet()){
            int fA=frequencyA.get(key);
            int fB=frequencyB.getOrDefault(key,0);
            int num=0;
            if(fA<=fB)
                num=fA;
            else
                num=fB;
            while(num>0){
                result.add(key);
                num--;
            }
        }

       result.stream().forEach(System.out::println);
    }
}
