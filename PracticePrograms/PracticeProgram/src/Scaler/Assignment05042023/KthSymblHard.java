package Scaler.Assignment05042023;

public class KthSymblHard {
    public static void main(String[] args) {
        int A=4;
        long B=4;
        int ans=KthDigit(A,B);
        System.out.println(ans);

    }

    private static int KthDigit(int a, long b) {
        if(a==0 || b==0)
            return 0;
        long mid=(long)Math.pow(2,a-1)/2;
        if(b<mid)
            return KthDigit(a-1,b);
        else
            return KthDigit(a-1,b-mid)^1;
    }
}
