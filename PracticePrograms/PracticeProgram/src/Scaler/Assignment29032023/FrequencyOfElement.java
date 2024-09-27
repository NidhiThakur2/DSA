package Scaler.Assignment29032023;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int A[]={2, 5, 9, 2, 8};
        int B[]={3, 2};
        Map<Integer,Integer> frequencyMap=new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++){
            if(!frequencyMap.containsKey(A[i])){
                frequencyMap.put(A[i],1);
            }else{
                int value=frequencyMap.get(A[i]);
                frequencyMap.put(A[i],value+1);
            }
        }
        for(int i=0;i<B.length;i++){
            if(!frequencyMap.containsKey(B[i]))
                B[i]=0;
            else
                B[i]=frequencyMap.get(B[i]);
        }
        Arrays.stream(B).forEach(System.out::println);

    }
}
