package Scaler.Assignment27022023;

public class SubSequences {
    public static void main(String[] args) {
        int aCount=0,pairCount=0;
        String str="GABGGAGGG";
        char[] A=str.toCharArray();
        for(int i=0;i<=A.length-1;i++){
            if(A[i]=='A')
                aCount++;
            if(A[i]=='G')
                pairCount=pairCount+aCount;
        }
        System.out.println(pairCount);
    }
}
