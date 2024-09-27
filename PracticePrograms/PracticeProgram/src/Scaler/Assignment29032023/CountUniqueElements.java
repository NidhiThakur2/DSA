package Scaler.Assignment29032023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountUniqueElements {
    public static void main(String[] args) {
        int []A={3, 3, 3, 9, 0, 1, 0};
        Map<Integer,Integer> freqMap=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<A.length;i++){
            freqMap.put(A[i],freqMap.getOrDefault(A[i],0)+1);
        }
        for(Integer key: freqMap.keySet()){
            if(freqMap.get(key)==1)
                count++;
        }
        System.out.println(count);

    }
}
