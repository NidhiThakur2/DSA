package Scaler.Assignment31032023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(0);
        A.add(1);
        /*A.add(-2);
        A.add(16);
        A.add(-12);
        A.add(5);
        A.add(7);
        A.add(-1);
        A.add(2);
        A.add(12);
        A.add(11);*/
        Integer B=1;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        hm.put(0,1);
        int sum=0;
        int count=0;

        for(int i=0;i<A.size();i++){
            sum=sum+A.get(i);
            int diff=sum-B;
            if(hm.containsKey(diff)){
                count=count+hm.get(diff);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        System.out.println(count);

    }
}
