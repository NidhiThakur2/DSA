package Scaler.Assignment03042023;

public class ReverseString {
    public static void main(String[] args) {
        String A="Nidhi";
        reverseString(A,A.length()-1);
    }

    private static void reverseString(String a, int length) {
        if(length==0){
            System.out.print(a.charAt(length));
            return;
        }
        System.out.print(a.charAt(length));
        reverseString(a,length-1);

    }
}
