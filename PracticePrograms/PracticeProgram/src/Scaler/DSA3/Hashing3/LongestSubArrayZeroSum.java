package Scaler.DSA3.Hashing3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static void main(String[] args) {
        int A[]=new int[]{9,-20,-11,-8,-4,2,-12,14,1};
        int ans=findLongestSubArray(A);
        System.out.println(ans);
    }

    private static int findLongestSubArray(int[] a) {
        int sum=0;
        int maxLength=Integer.MIN_VALUE;
        int start=-1, end=-1;
        int ans=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==0){
                int length=i+1;
                if(length>=maxLength){
                    maxLength=length;
                    start=0;
                    end=i;
                }
            }
            else if(hm.containsKey(sum)){
                int length=i-hm.get(sum);
                if(length>maxLength){
                    maxLength=length;
                    start=hm.get(sum);
                    end=i;
                }
            }
            hm.put(sum,i);
        }
        ans=end-start;
        return ans;
    }
}
