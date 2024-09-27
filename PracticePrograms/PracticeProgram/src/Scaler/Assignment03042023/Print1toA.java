package Scaler.Assignment03042023;

public class Print1toA {
    public static void main(String[] args) {
        int A=10;
        printA(A);
    }

    private static void printA(int a) {
        if(a==1)
            return;
       printA(a-1);
       System.out.println(a);
    }
}
