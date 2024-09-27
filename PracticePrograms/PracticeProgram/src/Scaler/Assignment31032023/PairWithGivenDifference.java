package Scaler.Assignment31032023;

public class PairWithGivenDifference {
    public static void main(String[] args) {
        int A[]={-10, 20};
        int B=30;
        for(int i=0;i<A.length;i++){
            int diff=0;
            int diff1=0;
            for(int j=i+1;j<A.length;j++){
                diff=A[i]-A[j];
                diff1=A[j]-A[i];
                if(diff==B || diff1==B)
                    System.out.println(1);

            }

        }
        System.out.println(0);
    }
}
