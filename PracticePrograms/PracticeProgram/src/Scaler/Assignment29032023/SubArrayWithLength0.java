package Scaler.Assignment29032023;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithLength0 {
    public static void main(String[] args) {
        int A[]={-1,1};
        long pf[]=new long[A.length];

        Map<Long,Integer> pfMap=new HashMap<Long,Integer>();
        pf[0]=A[0];
        for(int i=1;i<A.length;i++){
            pf[i]=pf[i-1]+A[i];
            if(pfMap.containsKey(pf[i]) || pf[i]==0){
                System.out.println(1);
                break;
            }
            else
                pfMap.put(pf[i],1);
        }
        if(pf.length==A.length)
            System.out.println(0);
    }
}
