package Scaler.Assigment15032023;

public class UnsetBit {
    public static void main(String[] args) {
        int A=4,B=1;
        int result= A&(1<<B);
        if(result!=0){
            A=A^(1<<B);
        }
        System.out.println(A);
    }
}
