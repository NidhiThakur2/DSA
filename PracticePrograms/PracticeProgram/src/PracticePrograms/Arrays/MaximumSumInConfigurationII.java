package PracticePrograms.Arrays;

public class MaximumSumInConfigurationII {
    public static void main(String[] args) {
        int []A=new int []{8, 3, 1, 2};
        int ans=0;
        int cum_sum=0,curr_val=0;
        for(int i=0;i<A.length;i++){
            cum_sum+=A[i];
        }
        for(int i=0;i<A.length;i++){
            curr_val+=i*A[i];
        }
        for(int i=1;i<A.length;i++){
            int next_val=curr_val-(cum_sum-A[i-1])+(A.length-1)*A[i-1];
            curr_val=next_val;
            ans=Integer.max(ans,next_val);
        }
        System.out.println(ans);
    }
}
