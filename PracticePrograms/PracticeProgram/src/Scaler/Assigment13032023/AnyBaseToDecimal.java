package Scaler.Assigment13032023;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int A=22,B=3;
        int count=0,ans=0;
        while(A>0){
            int lastDigit=A%10;
            ans=ans+lastDigit*pow(B,count);
            count++;
            A=A/10;
        }
        System.out.println(ans);

    }

    private static int pow(int b, int count) {
        int ans=1;
        if(count==0)
            return 1;
        else
              ans=b*pow(b,count-1);
        return ans;
    }
}
