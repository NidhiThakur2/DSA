package PracticePrograms.Strings;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int sum=findTotalLength(A,B);
        String isOrdered=isOrder(A,B);
        String toUpper=toUpper(A,B);
        System.out.println(sum);
        System.out.println(isOrdered);
        System.out.println(toUpper);
    }

    private static String isOrder(String a, String b) {
        int i=0;
        while(i<a.length() && i<b.length()){
            if(a.toUpperCase().charAt(i)>b.toUpperCase().charAt(i)){
                return "Yes";
            } else if (a.toUpperCase().charAt(i)<b.toUpperCase().charAt(i)) {
                return "No";
            }
            i++;
        }
        if(a.length()<b.length())
            return "No";
        return "Yes";
    }

    static int findTotalLength(String A, String B){
        return A.length()+B.length();
    }
    static String toUpper(String A,String B){
        String str=A+" "+B;
        StringBuilder sb =new StringBuilder();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                sb.append((char)('A'+str.charAt(i)-'a'));
            }
            if(str.charAt(i)==' ')
                sb.append(' ');
            i++;
        }
        return sb.toString();
    }
}
