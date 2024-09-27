package Scaler.MockInterview.DSA;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int [] A=new int[]{1,2,3,4,5,6};
        int pfs[]=new int[A.length];
        pfs[0]=A[0];
        for(int i=1;i<A.length;i++){
            pfs[i]=pfs[i-1]+A[i];
        }
        int n=A.length;
        int lSum=0;
        int totalSum=pfs[n-1];
        int rSum=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            lSum=pfs[i]-A[i];
            rSum=totalSum-pfs[i];
            if(lSum==rSum){
                ans=i;
                break;
            }

        }
        System.out.println(ans);
    }
}
