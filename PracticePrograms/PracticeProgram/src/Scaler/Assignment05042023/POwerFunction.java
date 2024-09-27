package Scaler.Assignment05042023;

public class POwerFunction {
    public static void main(String[] args) {
        int A=71045970,B=41535484,C=64735492;
        int ans=pow(A,B,C);
        System.out.println(ans);
    }

    private static int pow(int a, int b, int c) {
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
}
