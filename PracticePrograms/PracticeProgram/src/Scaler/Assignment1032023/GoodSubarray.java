package Scaler.Assignment1032023;

public class GoodSubarray {
    public static void main(String[] args) {
        int []A={13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B=65;
        int count=0;
        long sum=0;
        for(int i=0;i<A.length;i++){
            sum=0;
            for(int j=i;j<A.length;j++){
                sum+=(long)A[j];
                int length=j-i+1;
                if(length%2==0){
                    if(sum<B){
                        count++;
                    }
                }
                if(length%2!=0){
                    if(sum>B){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
