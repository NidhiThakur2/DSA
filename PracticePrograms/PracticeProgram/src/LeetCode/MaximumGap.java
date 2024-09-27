package LeetCode;

import java.util.Arrays;

class MaximumGap {
    public static void main(String[] args) {
        Solution s=new Solution();
        int ans=s.maximumGap(new int[]{1,10000000});
        System.out.println(ans);
    }
}
class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length<2)
            return 0;

        int placeValue=1;
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxValue=Math.max(maxValue,nums[i]);
        }
        while(maxValue/placeValue>0){
            countingSort(nums,placeValue);
            placeValue *=10;
        }
       // Arrays.stream(nums).forEach(System.out::println);
        int maxGap=0;
        for(int i=0;i<nums.length-1;i++){
            maxGap=Math.max(nums[i+1]-nums[i],maxGap);
        }
        return maxGap;
    }
    private void countingSort(int[]nums, int placeValue){
        int num_digits=10;
        int[] count=new int[num_digits];
        for(int i=0;i<nums.length;i++){
            int current=nums[i]/placeValue;
            count[current%num_digits]+=1;
        }
        int startingIndex=0;
        for(int i=0;i<count.length;i++){
            int temp=count[i];
            count[i]=startingIndex;
            startingIndex+=temp;
        }
        int []sortedArray=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int current=nums[i]/placeValue;
            sortedArray[count[current%num_digits]]=nums[i];
            count[current%num_digits]+=1;
        }
       // Arrays.stream(sortedArray).forEach(System.out::println);
        System.arraycopy(sortedArray,0,nums,0,nums.length);
    }
}