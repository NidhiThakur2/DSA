package Scaler.Assignment9032023;

public class SpecialIndex {
    public static void main(String[] args) {
        int A[]={1, 1, 1};
        int n=A.length;
        int count=0;
        int pfe[]=new int[A.length];
        int pfo[]=new int[A.length];
        pfe=findPrefixSumEven(A);
        pfo=findPrefixSumOdd(A);
        for(int i=0;i<A.length;i++){
            int evenSum=0;
            int oddSum=0;
            if(i==0){
                evenSum = pfo[n - 1]-pfo[i];
                oddSum = pfe[n - 1]-pfe[i];

            }else {
                evenSum = pfe[i - 1] + pfo[n - 1] - pfo[i];
                oddSum = pfo[i - 1] + pfe[n - 1] - pfe[i];
            }
            if(evenSum==oddSum)
                count++;
        }
        System.out.println(count);

    }
    private static int[] findPrefixSumEven(int[] A) {
        int pfe[]=new int[A.length];
        pfe[0]=A[0];
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                pfe[i]=pfe[i-1]+A[i];
            }else
                pfe[i]=pfe[i-1];
        }
        return pfe;
    }

    private static int[] findPrefixSumOdd(int[] A) {
        int pfo[]=new int[A.length];
        pfo[0]=0;
        for(int i=1;i<A.length;i++){
            if(i%2!=0){
                pfo[i]=pfo[i-1]+A[i];
            }else
                pfo[i]=pfo[i-1];
        }
        return pfo;
    }
}
