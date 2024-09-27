package Scaler.Assignment07072023;

public class gcd {
    public static void main(String[] args) {
        int ans=gcd(51,68);
        System.out.println(ans);
    }
    private static int gcd(int A, int B) {
        if(B==0)
            return A;
        return gcd(B,A%B);
    }
}
