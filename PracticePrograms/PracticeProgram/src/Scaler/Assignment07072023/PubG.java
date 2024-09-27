package Scaler.Assignment07072023;

public class PubG {
    public static void main(String[] args) {
        int []A=new int[]{2,3,4};
        int ans=findMinimumHealth(A);
        System.out.println(ans);
    }

    private static int findMinimumHealth(int[] a) {
        int pfGcd=a[0];
        for(int i=1;i<a.length;i++){
            pfGcd=gcd(pfGcd,a[i]);
        }
        return pfGcd;
    }
    private static int gcd(int A, int B) {
        if(B==0)
            return A;
        return gcd(B,A%B);
    }
}
