package Scaler.DSA4.DynamicProgramming;

public class Stairs {
    public static void main(String[] args) {
        int A=12321;
        long first=0l;
        long second=1l;
        long ans=0l;
        for(int i=1;i<=A;i++){
            ans=(first+second)%1000000007;
            first=second;
            second=ans;
        }
        System.out.println(ans);
    }
}
