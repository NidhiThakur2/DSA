package Scaler.Assigment15032023;

public class CheckBit {
    public static void main(String[] args) {
        int A=10,B=3;
        int result= A&(1<<B);
        if(result!=0)
            System.out.println(1);
        else
            System.out.println(0);


    }
}
