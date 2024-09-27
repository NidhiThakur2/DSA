package Scaler.Assignment31032023;

public class CountPairDifference {
    public static void main(String[] args) {
        int A[]={3, 5, 1, 2};
        int B=4;
        int count=0;
        for(int i=0;i<A.length;i++){
            int diff=0;
            int diff1=0;
            for(int j=i+1;j<A.length;j++){
                diff=A[i]-A[j];
                diff1=A[j]-A[i];
                if(diff==B || diff1==B)
                    count++;

            }
        }
        System.out.println(count%(1000000000+7));
    }
}
