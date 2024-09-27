package Scaler.MockInterview.DSA;

public class RainWaterTrapped {
    public static void main(String[] args) {
        int []A=new int []{0, 1, 0, 2};
        int n=A.length;
        int []lMax=new int[A.length];
        int []rMax=new int[A.length];
        lMax[0]=A[0];
        rMax[n-1]=A[n-1];
        int trappedWater=0;
        for(int i=1;i<n;i++){
            lMax[i]=Integer.max(lMax[i-1],A[i]);
        }
        for(int i=n-2;i>=0;i--){
            rMax[i]=Integer.max(rMax[i+1],A[i]);
        }
        for(int i=0;i<n;i++){
            trappedWater = trappedWater + Integer.min(lMax[i],rMax[i])-A[i];
        }
        System.out.println(trappedWater);
    }
}
