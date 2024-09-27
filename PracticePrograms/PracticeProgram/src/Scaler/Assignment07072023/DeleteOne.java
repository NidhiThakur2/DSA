package Scaler.Assignment07072023;

public class DeleteOne {
    public static void main(String[] args) {
        int A[]=new int[]{5, 15, 30};
        int []pfGcd=getPfgcd(A);
        int []sfGcd=getSfgcd(A);
        int max=1;
        int n=A.length;
        for(int i=0;i<A.length;i++){
            int temp=0;
            if(i==0)
                temp=sfGcd[i+1];
            else if(i==n-1)
                temp=pfGcd[n-2];
            else{
                temp=gcd(pfGcd[i-1],sfGcd[i+1]);
            }
            if(temp>max)
                max=temp;


        }
        System.out.println(max);
    }

    private static int[] getPfgcd(int[] a) {
        int []pfGcd=new int [a.length];
        pfGcd[0]=a[0];
        for(int i=1;i<a.length;i++){
            pfGcd[i]=gcd(pfGcd[i-1],a[i]);
        }
        return pfGcd;
    }

    private static int[] getSfgcd(int[] a) {
        int []sfGcd=new int [a.length];
        int n=a.length;
        sfGcd[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            sfGcd[i]=gcd(sfGcd[i+1],a[i]);
        }
        return sfGcd;

    }
    private static int gcd(int A, int B) {
        if(B==0)
            return A;
        return gcd(B,A%B);
    }

}
