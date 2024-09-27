package Scaler.Assignment22032023;

public class IncreasingTriplets {
    public static void main(String[] args) {
        int A[]={2, 1, 2, 3};
        int ans=0;
        for(int i=1;i<A.length-1;i++){
            int l=0,r=0,triplet=0;
            for(int j=i-1;j>=0;j--){
                    if(A[j]<A[i])
                        l++;
            }
            for(int j=i+1;j<=A.length-1;j++){
                   if(A[j]>A[i])
                       r++;
            }
            triplet=l*r;
            ans=ans+triplet;
        }
    System.out.println(ans);
    }
}
