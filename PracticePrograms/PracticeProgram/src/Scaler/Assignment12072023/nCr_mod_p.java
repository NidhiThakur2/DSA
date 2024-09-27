package Scaler.Assignment12072023;

public class nCr_mod_p {
    public static void main(String[] args) {
        int A=5,B=2,C=13;
        long Af=factorial(A,C)%C;
        long Bf=factorial(B,C)%C;
        long ABf=factorial(A-B,C)%C;
        int BfPow=pow(Bf,C-2,C);
        int ABfPow=pow(ABf,C-2,C);
        System.out.println(((Af*BfPow)%C*(ABfPow%C))%C);

    }

    private static int pow(long a, int b, int c) {
        if(a==0)
            return 0;
        if(b==0)
            return 1;
        long p=pow(a,b/2,c);
        long result=p*p%c;
        if(b%2!=0)
            result=(result*a)%c;
        result=((result%c)+c)%c;
        return (int)result;
    }

    private static long factorial(int a,int c) {
        long ans=1;
        for(int i=a;i>=1;i--){
            ans=(ans%c*i%c)%c;
        }
        return ans;
    }

}
