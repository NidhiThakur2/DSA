package PracticePrograms.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountPairOfGivenSum {
    public static void main(String[] args) {
        int []arr=new int []{1, 1, 1, 1};
        int n=4,k=2;
        Map<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=k-arr[i];
            if(hs.containsKey(num)){
                count+=hs.get(num);
            }
            int freq=hs.getOrDefault(arr[i],0);
            hs.put(arr[i],freq+1);

        }
        System.out.println(count);
    }
}
