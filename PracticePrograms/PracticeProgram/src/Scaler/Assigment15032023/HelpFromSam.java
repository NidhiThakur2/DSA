package Scaler.Assigment15032023;

public class HelpFromSam {
    public static void main(String[] args) {
        int A=121;
        int count=0;
        while(A>0){
            if((A&1)==1)
                count++;

            A=A>>1;

        }
        System.out.println(count);


    }
}
