package Scaler.Assignment22032023;

public class JoshephusProblem {
    public static void main(String[] args) {
        int A=9;
        int poisitionAfterKilling=0;
        int pow=1;
        while(pow<A){
                pow=pow*2;
        }
        System.out.println(pow/2);
        int killing=A-(pow/2);
        poisitionAfterKilling=2*killing;
        System.out.println(1+poisitionAfterKilling);
    }
}
