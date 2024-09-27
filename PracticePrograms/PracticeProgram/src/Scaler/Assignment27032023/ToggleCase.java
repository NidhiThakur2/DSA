package Scaler.Assignment27032023;

public class ToggleCase {
    public static void main(String[] args) {
        String str="skfkdAADNNBBFass";
        char[] A=str.toCharArray();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<A.length;i++){
            int num=A[i];
            num=num^(1<<5);
            A[i]=(char)num;
            result.append(A[i]);
        }
        System.out.println(result);
    }
}
