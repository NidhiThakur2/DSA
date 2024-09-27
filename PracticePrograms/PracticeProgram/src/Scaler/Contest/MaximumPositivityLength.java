package Scaler.Contest;

public class MaximumPositivityLength {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        int pf[]=new int[A.length];
        int maxLength=0;
        pf[0]=A[0];
        for(int i=1;i<A.length;i++){
            pf[i]=pf[i-1]+A[i];
        }
        int length;
        if(pf[0]>0)
            length=1;
        else
            length=0;
        for(int i=1;i<pf.length;i++){
            if(pf[i]>pf[i-1]) {
                length++;
                if(length>=maxLength)
                    maxLength=length;
            }else
                length=0;

        }
        System.out.println(maxLength);
    }
}
