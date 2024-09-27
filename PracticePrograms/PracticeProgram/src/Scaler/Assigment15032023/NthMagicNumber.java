package Scaler.Assigment15032023;

public class NthMagicNumber {
    public static void main(String[] args) {
        int A=7;
        int i=1;
        int sum=0;
        while(A>0){
            if((A&1)!=0)
                sum=sum+pow(5,i);
            i++;
            A=A>>1;
        }
        System.out.println(sum);
    }

    private static int pow(int i, int i1) {
        int ans=1;
        if(i1==1)
            return i;
        else
            return i*pow(i,i1-1);
    }
}
