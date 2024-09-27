package Scaler.Assignment31032023;

public class CheckPairSum {
    public static void main(String[] args) {
        int []B={9, 10, 7, 10, 9, 1, 5, 1, 5};
        int A=21;
        for(int i=0;i<B.length;i++){
            int sum=0;
            for(int j=i+1;j<B.length;j++){
                sum=B[i]+B[j];
                if(sum==A) {
                    System.out.println(1);
                    break;
                }
            }
        }
        System.out.println(0);
    }
}
