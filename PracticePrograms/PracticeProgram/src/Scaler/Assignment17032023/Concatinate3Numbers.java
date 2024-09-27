package Scaler.Assignment17032023;

public class Concatinate3Numbers {
    public static void main(String[] args) {
        int A= 97, B=63,C=32;
        if(A>B){
            int temp=A;
            A=B;
            B=temp;
        }if(A>C){
            int temp=A;
            A=C;
            C=temp;
        }
        if(B>C){
            int temp=B;
            B=C;
            C=temp;
        }
        int num=Integer.parseInt(""+A+""+B+""+C);

        System.out.println(num);
    }
}
