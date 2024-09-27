package Scaler.Assignment9032023;

public class MajorityElements {
    public static void main(String[] args) {
        int A[]={1,1,1,1,1,3,5,7,1,5,1,8};
        int count=1;
        int ans=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]==ans)
                count++;
            else{
                if(count==0){
                    ans=A[i];
                    count++;
                }else
                    count--;
            }


        }
        System.out.println(ans);
    }
}
