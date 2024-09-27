package Scaler.Assignment03042023;

public class PrintAto1 {
    public static void main(String[] args) {
        int A=10;
        printNums(A);
        System.out.println("");
    }

    private static void printNums(int a) {
        if(a==1){
            System.out.println(1+" ");
            return;
        }
        System.out.print(a+" ");
        printNums(a-1);
    }
}
