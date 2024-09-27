package Scaler.DSA2.BinarySearch2_04102023;

public class AthMagicalNumber {
    public static void main(String[] args) {
        int A=807414236,B=3788,C=38141;
        long AthMagicalNumber=findMagicalNumber(A,B,C);
        System.out.println((int)AthMagicalNumber%1000000007);

    }

    private static long findMagicalNumber(long a, long b,long c) {
        long right=((long)a*Math.min(b,c));
        long ans=-1;
        long left=1;
        long lcm=(b*c)/gcd(b,c);
        while(left<=right){
                long mid=(left+right)/2;
                long nthMagicalNumber=(mid/b)+(mid/c)-(mid/lcm);
                if(nthMagicalNumber<a)
                    left=mid+1;
                else if(nthMagicalNumber>a)
                    right=mid-1;
                else {
                    ans = mid;
                    right=mid-1;
                }
            }

        return ans%1000000007;
     }
    static long gcd(long b,long c){
        if(c==0)
            return b;
        return gcd(c,b%c);
    }
}
