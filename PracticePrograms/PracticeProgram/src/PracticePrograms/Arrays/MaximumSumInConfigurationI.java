package PracticePrograms.Arrays;

public class MaximumSumInConfigurationI {
    public static void main(String[] args) {
        int []A=new int []{8, 3, 1, 2};
        int ans=0;
        for(int i=0;i<A.length;i++){
            int curr_sum=0;
            for(int j=0;j<A.length;j++){
                int index=(i+j)%A.length;
                curr_sum+=j*A[index];
            }
            ans=Integer.max(ans,curr_sum);
        }
        System.out.println(ans);
    }
}
