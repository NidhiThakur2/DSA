import java.util.Arrays;

public class InPlaceSorting {
    public static void main(String[] args) {
        int nums[]=new int[]{2, 0, 2, 1, 1, 1};
        nums=inPlaceSorting(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    private static int[] inPlaceSorting(int[] nums) {
        int n=nums.length;
        int p1=0;
        int p2=n-1;
        int mid=p1;
        int temp=0;
        if(p1==p2)
            return nums;
        while(mid<=p2){
            switch(nums[mid]){
                case 0: {
                    temp=nums[p1];
                    nums[p1]=nums[mid];
                    nums[mid]=temp;
                    p1++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2:{
                    temp=nums[p2];
                    nums[p2]=nums[mid];
                    nums[mid]=temp;
                    p2--;
                    break;
                }

            }
            Arrays.stream(nums).forEach(System.out::print);
            System.out.println();

        }
        return nums;
    }

}
