package Scaler.Assignment03042023;

public class Factorial {
    public static void main(String[] args) {
        int A=1;
        int ans=findFactorial(A);
        System.out.println(ans);
    }

    private static int findFactorial(int a) {
        if(a==0)
            return 1;
        return a*findFactorial(a-1);
    }
}
