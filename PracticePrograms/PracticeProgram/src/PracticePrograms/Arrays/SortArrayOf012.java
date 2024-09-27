package PracticePrograms.Arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int []nums=new int []{2, 0, 2, 1, 1, 0};
        nums=inPlaceSorting(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static int[] inPlaceSorting(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,m=l;
        while(m<r){
            switch(nums[m]){
                case 0: {
                    int temp=nums[l];
                    nums[l]=nums[m];
                    nums[m]=temp;
                    l++;
                    m++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                    int temp=nums[r];
                    nums[r]=nums[m];
                    nums[m]=temp;
                    r--;
                    break;
                }

            }
        }
        return nums;
    }
}
