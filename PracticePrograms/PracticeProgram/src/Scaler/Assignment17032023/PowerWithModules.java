package Scaler.Assignment17032023;

public class PowerWithModules {
    public static void main(String[] args) {
        int A=55711,B=284,C=64649;
        int ans=A%C;
        int result=1;
        System.out.println(ans);
        for(int i=1;i<=B;i++){
            result=(result%C)*ans%C;


        }
        System.out.println(result%C);
    }
}
