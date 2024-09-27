package Scaler.Assignment27032023;

public class ReverseString {
    public static void main(String[] args) {
        String str="Scaler";
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());

    }
}
