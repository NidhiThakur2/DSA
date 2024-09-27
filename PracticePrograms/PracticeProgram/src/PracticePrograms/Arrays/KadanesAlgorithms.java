package PracticePrograms.Arrays;

public class KadanesAlgorithms {
    public static void main(String[] args) {
        int []A=new int[]{-1,-2,-3,-4};
        int sum=0;
        int maxSum=-1;
        for(int i=0;i<A.length;i++){
           sum+=A[i];
           if(sum>maxSum)
               maxSum=sum;
           if(sum<=0)
                sum = 0;
        }
        System.out.println(maxSum);
    }
}
