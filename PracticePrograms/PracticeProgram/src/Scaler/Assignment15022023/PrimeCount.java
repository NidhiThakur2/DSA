package Scaler.Assignment15022023;

public class PrimeCount {
    public static void main(String[] args) {
        int A=10,count=0;
        for(int i=1;i<=A;i++){
            int isPrime=isPrime(i);
                if(isPrime==1)
                    count++;
        }
        System.out.println(count);
    }
    private static int isPrime(long A){
        int count=0;
        if(A==1)
            return 0;
        if(A==2)
            return 1;
        for(int i=1;i*i<=A;i++){
            if(A%i==0) {
                if (i == A/i)
                    count++;
                else
                    count += 2;
            }
            if(count>=3)
                return 0;
        }
        return 1;
    }
}
