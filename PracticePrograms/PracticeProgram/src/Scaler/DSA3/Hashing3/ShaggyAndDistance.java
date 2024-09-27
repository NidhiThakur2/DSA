package Scaler.DSA3.Hashing3;

import java.util.HashMap;

public class ShaggyAndDistance {
    public static void main(String[] args) {
        int []A=new int[]{1,1};
        int minDistance=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(!hm.containsKey(A[i])){
                hm.put(A[i],i);
            }else{
                int dist=i-hm.get(A[i]);
                if(dist<minDistance)
                    minDistance=dist;
            }
        }
        System.out.println(minDistance);
    }
}
