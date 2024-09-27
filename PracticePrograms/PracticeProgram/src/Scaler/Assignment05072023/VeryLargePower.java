package Scaler.Assignment05072023;

public class VeryLargePower {
    public static void main(String[] args) {
        int A=2,B=45433;
        long ans=A;
        for(int i=B;i>=1;i--) {
            ans=power((long)ans,(long)i);
        }

        System.out.println((int)ans);

    }

    private static long power(long ans, long b) {
        if(b==0)
            return 1;
        long pow=power(ans,b/2);
        if(b%2==0){
            return (pow*pow)%1000000007;
        }else{
            return ((pow * pow)%1000000007 * ans%1000000007)%1000000007;
        }
    }


}
