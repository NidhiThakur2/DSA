package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int []nums=new int[]{-4987,-10000,0,3876,10976};
        PriorityQueue<Integer> resultMH=new PriorityQueue<Integer>();
        for(int i=0;i< nums.length;i++){
            int square=square(nums[i]);
            resultMH.add(square);
        }
        int i=0;
        while(!resultMH.isEmpty()){
            nums[i]=resultMH.poll();
            i++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static int square(int num) {
        if(num==0)
            return 0;
        int mod=1000000007;
        int p=num * num ;
        return p%mod;
    }
}
