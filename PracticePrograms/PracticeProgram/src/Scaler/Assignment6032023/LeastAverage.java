package Scaler.Assignment6032023;

public class LeastAverage {
    public static void main(String[] args) {
        //int []A={3, 7, 90, 20, 10, 50, 40};
        int []A={20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B=9;
        int sum=0;
        for(int i=0;i<B;i++){
            sum=sum+A[i];
        }
        int avg=sum;
        int start=1,end=B;
        int minCount=0;
        while(end<A.length){
            sum=sum-A[start-1]+A[end];
            System.out.println("sub Array:"+start+" sum:" +sum);
            if(sum<avg) {
                avg=sum;
                minCount=start;
            }
            start++;
            end++;

        }
        System.out.println("Minimum Average:"+avg);
        System.out.println(minCount);

    }
}
