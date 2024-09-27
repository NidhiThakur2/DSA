package LeetCode;

import java.util.Map;

public class MaximumsumSubarray {
    public static void main(String[] args) {
        int[] nums=new int []{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentMax=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            currentMax=Integer.max(currentMax,0)+nums[i];
            max=Integer.max(currentMax,max);

        }
        System.out.println(max);
    }
}
