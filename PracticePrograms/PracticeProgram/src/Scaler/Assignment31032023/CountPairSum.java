package Scaler.Assignment31032023;

public class CountPairSum {
    public static void main(String[] args) {
        int A[]={1, 2, 1, 2};
        int B=3;
        int count=0;
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i+1;j<A.length;j++){
                sum=A[i]+A[j];
                if(sum==B)
                    count++;

            }
        }
        System.out.println(count);
    }
}
