package Scaler.Assignment03042023;

public class Fibonacci {
    public static void main(String[] args) {
        int A=9;
        int ans=findAthfibonacci(A);
        System.out.println(ans);
    }

    private static int findAthfibonacci(int i) {
        if(i==0||i==1)
            return i;
        return findAthfibonacci(i-1)+findAthfibonacci(i-2);
    }
}
