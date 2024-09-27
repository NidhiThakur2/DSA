package Scaler.Assignment6032023;

public class LeastAverage1 {
    public static void main(String[] args) {
        int []A={20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B=9;
        int n = A.length;
        int sum = 0;
        int index = 0;
        for(int i = 0; i<B; i++){
            sum = sum+A[i];
        }
        int s = 1; int e = B;
        int avg=sum;
        while(s<=n-B){
            sum = sum-A[s-1]+A[e];
            System.out.println("sub Array:"+s+" avg:" +avg);
            if(sum<avg){
                avg = sum;
                index = s;
            }

            s++;
            e++;
        }

        System.out.println(index);
    }
}
