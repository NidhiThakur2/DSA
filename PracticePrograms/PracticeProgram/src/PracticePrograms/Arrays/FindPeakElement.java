package PracticePrograms.Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,1,3,5,6,4};
        int ans=findPeak(nums);
        System.out.println(ans);

    }

    private static int findPeak(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        if(nums[left]>nums[left+1])
           return nums[left];
        if(nums[right]>nums[right-1])
            return nums[right];
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if (nums[mid]<nums[mid-1])
                right=mid-1;
            else
                left=mid+1;

        }
        return -1;
    }
}
