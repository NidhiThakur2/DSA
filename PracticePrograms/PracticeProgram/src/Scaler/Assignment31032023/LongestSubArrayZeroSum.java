package Scaler.Assignment31032023;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayZeroSum {
    public static void main(String[] args) {
       // int []A={1, -2, 1, 2};
        int []A={9, -20, -11, -8, -4, 2, -12, 14, 1};
        long pfA[]=new long[A.length];
        int length=0,maxLength=length;
        Map<Long,Integer> pfIndexMap=new HashMap<Long,Integer>();
        pfIndexMap.put(0L,-1);
        for(int i=0;i<A.length;i++){
            if(i==0)
                pfA[i]=A[i];
            else
                pfA[i]=pfA[i-1]+A[i];
            if(pfIndexMap.containsKey(pfA[i])){
                int index=pfIndexMap.get(pfA[i]);
                if(index==-1)
                    pfIndexMap.put(pfA[i],i);
                length=i-index;
                if(length>=maxLength)
                    maxLength=length;
            }else{
                pfIndexMap.put(pfA[i],i);
            }
        }
        System.out.println(maxLength);
    }
}
