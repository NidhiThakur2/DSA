package Scaler.DSA3.contest;

public class CountBracketReversals {
    public static void main(String[] args) {
        String A="[[]][]][";
        int ans=countReversal(A);
        System.out.println(ans);

    }

    private static int countReversal(String A) {
        int len=A.length();
        if(len%2!=0) return -1;
        int ans=0;
        int diff=0;
        for(int i=0;i<len;i++){
            if(A.charAt(i)=='[')
                diff++;
            if(A.charAt(i)==']')
                diff--;
            if(diff<0){
                ans+=1;
                diff+=2;
            }
        }
        if(diff==0)
            return ans;
        ans+=diff/2;
        return ans;

    }
}
