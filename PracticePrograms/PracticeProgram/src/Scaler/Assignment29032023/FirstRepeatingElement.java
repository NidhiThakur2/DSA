package Scaler.Assignment29032023;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int A[]={6, 10, 5, 4, 9, 120};
        Map<Integer,Integer> indexMap=new HashMap<Integer,Integer>();
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(!indexMap.containsKey(A[i])) {
                indexMap.put(A[i], i);
            }
            else{
                int index=indexMap.get(A[i]);
                if(index<minIndex)
                    minIndex=index;
            }
        }
        if(minIndex==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(A[minIndex]);
    }
}
