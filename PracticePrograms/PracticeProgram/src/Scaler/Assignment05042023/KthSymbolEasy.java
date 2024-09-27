package Scaler.Assignment05042023;

public class KthSymbolEasy {
    public static void main(String[] args) {
        int A=4,B=3;
        String str="0";
        String finalStr=generateString(new StringBuilder("0"),A,B);
        int ans=finalStr.charAt(B)-'0';
        System.out.println(ans);

    }

    private static String generateString(StringBuilder str, int a, int b) {
        if(a<=0 || str.length()>b)
            return str.toString();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                sb.append("01");
            if(str.charAt(i)=='1')
                sb.append("10");
        }
        return generateString(sb,a-1,b);
    }
}
