package Scaler.Assignment03042023;

public class Palindrome {
    public static void main(String[] args) {
        String A="madam";
        int i=0,j=A.length();
        int ans=isPalindrome(A,i,j-1);
        System.out.println(ans);
    }

    private static int isPalindrome(String a, int i, int j) {
        if(i>=j)
            return 1;
        if(a.charAt(i)!=a.charAt(j))
            return 0;

        return isPalindrome(a,i+1,j-1);

    }
}
