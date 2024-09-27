package Scaler.Assignment27032023;

public class ToUpper {
    public static void main(String[] args) {
        String str="skfkdAADNNBBFass";
        char[] A=str.toCharArray();
        for(int i=0;i<A.length;i++){
            int num=A[i];
            if(num>=97 && num<=122){
                num=num^(1<<5);
                A[i]=(char)num;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
