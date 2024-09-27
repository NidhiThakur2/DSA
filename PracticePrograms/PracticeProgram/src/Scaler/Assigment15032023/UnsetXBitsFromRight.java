package Scaler.Assigment15032023;

public class UnsetXBitsFromRight {
    public static void main(String[] args) {
        int A=93;
        int B=4;
        int i=0;
        while(i<B){
            if((A&(1<<i))!=0)
                A=A^(1<<i);
            i++;
        }
        System.out.println(A);

    }
}
