package Scaler.Assignment05042023;

public class IsMagic {
    public static void main(String[] args) {
        int A=83557;
        int sum=0;
        int ans=isMagical(A,sum);
        System.out.println(ans);
    }

    private static int isMagical(int a, int sum) {
        if(sum==1 && a==0)
            return 1;
        if(sum>0 && sum<10 && a==0)
            return 0;
        if(a==0){
            a=sum;
            sum=0;
        }
        return isMagical(a/10,sum+a%10);
    }
}
