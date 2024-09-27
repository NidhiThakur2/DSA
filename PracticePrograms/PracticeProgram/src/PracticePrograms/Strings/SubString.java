package PracticePrograms.Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String index=sc.nextLine();
        StringBuilder sb=new StringBuilder(index);
        String[] str=index.split(" ");
        System.out.println(A.substring(Integer.valueOf(str[0]),Integer.valueOf(str[1])+1));
    }
}
