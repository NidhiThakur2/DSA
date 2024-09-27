package PracticePrograms.Arrays;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int []nums=new int[]{3, 2, 1, 56, 10000, 167};
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}
