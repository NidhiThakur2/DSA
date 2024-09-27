package Scaler.Contest;

public class NUmberGame {
    public static void main(String[] args) {
        int A[]={5};
        int product=1;
        if(A.length==1)
            product=0;
        else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] >= A[i + 1]) {
                    product *= A[i];
                }
            }
        }
        System.out.println(998982812%(1000000000+7));

    }
}
