package Scaler.MockInterview.DSA;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static void main(String[] args) {
        int []A=new int[]{14,-1,1,-6,1,5,12,17};
        int subArraySum=0;
        int maxLength=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            subArraySum=subArraySum+A[i];
            if(subArraySum==0){
                maxLength=Integer.max(maxLength,i+1);
            }
            if(!hm.containsKey(subArraySum)){
                hm.put(subArraySum,i);
            }else{
                maxLength=Integer.max(maxLength,i-hm.get(subArraySum));
            }
        }
        System.out.println(maxLength);
    }
}
