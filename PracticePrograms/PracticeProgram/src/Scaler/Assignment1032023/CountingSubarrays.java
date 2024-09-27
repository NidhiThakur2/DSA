package Scaler.Assignment1032023;

public class CountingSubarrays {
    public static void main(String[] args) {
        int []A={1, 11, 2, 3, 15};
        int B=10;
        int sum=0;
        int count=0;
        for(int i=0;i<A.length;i++){
            sum=0;
            for(int j=i;j<A.length;j++){
                sum=sum+A[j];
                if(sum<B)
                    count++;
            }
        }
        System.out.println(count);
    }
}
