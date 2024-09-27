package Scaler.DSA2.BinarySearch2_04102023;

public class SquareRoot {
    public static void main(String[] args) {
        int A=123213;
        long ans=squareRoot(A);
        System.out.println((int)ans);
    }

    private static long squareRoot(long a) {
        long ans=0;
        long left=0;
        long right=a;
        while(left<=right){
            long mid=(left+right)/2;
            if((mid*mid)==a)
                return mid;
            else if((mid*mid)<a) {
                ans=mid;
                left = mid + 1;
            }
            else
                right=mid-1;
        }
        return ans;
    }
}
