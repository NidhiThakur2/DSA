package PracticePrograms.Arrays;

public class NthDigit {
    public static void main(String[] args) {
        int n=11;
        StringBuilder strB=new StringBuilder();
        strB.append("");
        for(int i=1;i<=n;i++){
            strB.append(String.valueOf(i));
        }
        int ans=strB.charAt(n-1)-'0';
        System.out.println(ans);
    }
}
