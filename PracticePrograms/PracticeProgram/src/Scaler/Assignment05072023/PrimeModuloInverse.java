package Scaler.Assignment05072023;

public class PrimeModuloInverse {
    public static void main(String[] args) {
        int A=12,B=55557209;
        int ans=power(A,B-2,B);
        System.out.println(ans);
    }
    private static int power(int a, int i, int b) {
        if(a==0)
            return 0;
        if(i==0)
            return 1;

        long halfPow=power(a,i/2,b);
        if(i%2==0){
            return (int) (halfPow%b*halfPow%b +b)%b;
        }else{
            return (int) (halfPow%b*halfPow%b *a%b +b)%b;
        }

    }
}
