package Scaler.Assignment27032023;

public class StringOperation {
    public static void main(String[] args) {
        String A="AbcaZeoB";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.length();i++){
            int num=A.charAt(i);
            if(num>=65 && num<=90){
                continue;
            } else if (num==97 || num==101 || num==105 || num==111 || num==117) {
                sb.append("#");
                
            }else{
                sb.append((char)num);
            }
        }
        sb.append(sb.toString());
        System.out.println(sb.toString());
    }
}
