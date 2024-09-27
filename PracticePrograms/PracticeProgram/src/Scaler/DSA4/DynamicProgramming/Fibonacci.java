package Scaler.DSA4.DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        long first=0l;
        long second=1l;
        long ans=0l;
        for(int i=2;i<=num;i++){
            ans=first+second;
            first=second;
            second=ans;
        }
        System.out.println((int)ans);
    }
}
