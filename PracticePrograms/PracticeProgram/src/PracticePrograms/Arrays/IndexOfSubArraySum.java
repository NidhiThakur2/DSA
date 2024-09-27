package PracticePrograms.Arrays;

import java.util.Arrays;

public class IndexOfSubArraySum {
    public static void main(String[] args) {
        int []nums=new int[]{1, 7, 3, 9};
        int k=10;
        int sum=0;
        int ans[]=new int[2];
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            found=false;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum>k){
                    sum-=nums[i];
                    break;
                }
                if(sum==k){
                    ans[0]=i;
                    ans[1]=j;
                    found=true;
                   break;
                }
            }
            if(found)
                break;
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
