package Scaler.Assignment03042023;

public class SumOfDigits {
    public static void main(String[] args) {
        int A=123;
        int ans=findSum(A);
        System.out.println(ans);
    }

    private static int findSum(int a) {
        if(a==0)
            return 0;
        return a%10+findSum(a/10);
    }
}
