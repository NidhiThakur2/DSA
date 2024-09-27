package PracticePrograms.Arrays;

import java.util.Arrays;

public class MoveNegativeNumbersToEndSameOrder {
    public static void main(String[] args) {
        int nums[]=new int[]{1, -1, 3, 2, -7, -5, 11, 6};
        int start=0,end=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]<0){
                start=i;
            }else{
                i++;
            }
            int j=start+1;
            while(j<nums.length && nums[j]<0) {
                j++;
            }
            end=j;
            nums=rotate(nums,start,end);
            i=end;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static int [] rotate(int[] nums, int start, int end) {
        int temp=nums[end];
        for(int i=end;i>start;i--){
            nums[i]=nums[i-1];
        }
        nums[start]=temp;
        return nums;
    }
}
