package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr=new int[]{3,3};
        int target=6;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int ans[]=new int[2];
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            int t=target-arr[i];
            if(hm.containsKey(t)){
                ans[0]=i;
                ans[1]=hm.get(t);
                found=true;
                break;
            }
            hm.put(arr[i],i);
        }
        if(found){
            Arrays.stream(ans).forEach(System.out::println);
        }


    }
}
