package Scaler.Assignment6032023;

public class SubArrayGivenSumAndLength {
    public static void main(String[] args) {
        int []A={4, 2, 2, 5, 1,7879,2342,322,4,4,3222,3,4,5,55,56566,1000};
        int B=4,C=10;
        int result=findSubArray(A,B,C);
        System.out.println(result);


    }

    private static int findSubArray(int[] A, int B, int C) {
        int start=0, end=B-1;
        while(end<A.length){
            int sum=0;
            for(int i=start;i<=end;i++){
                sum=sum+A[i];
            }
            if(sum==C)
                return 1;
            start++;
            end++;
        }
        return 0;
    }
}
