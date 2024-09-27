package Scaler.Contest;

import java.util.HashMap;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        String A="casio";
        System.out.println(A);
        A=reverse(A);
        System.out.println(A);
    }

    private static String reverse(String a) {
       char []ch=a.toCharArray();
       StringBuilder sb=new StringBuilder();
       int i=0,j=a.length()-1;
       while(i<=j){
           if((a.toLowerCase().charAt(i)=='a'||a.toLowerCase().charAt(i)=='e'||a.toLowerCase().charAt(i)=='i'||
                   a.toLowerCase().charAt(i)=='o'||a.toLowerCase().charAt(i)=='u') &&
                   (a.toLowerCase().charAt(j)=='a'||a.toLowerCase().charAt(j)=='e'||a.toLowerCase().charAt(j)=='i'||
                           a.toLowerCase().charAt(j)=='o'||a.toLowerCase().charAt(j)=='u')){
               Character temp=ch[j];
               ch[j]=ch[i];
               ch[i]=temp;
               i++;
               j--;
           }else{
               if(a.toLowerCase().charAt(i)!='a'&& a.toLowerCase().charAt(i)!='e'&& a.toLowerCase().charAt(i)!='i'&&
                       a.toLowerCase().charAt(i)!='o'&& a.toLowerCase().charAt(i)!='u'){
                   i++;
               }
               if(a.toLowerCase().charAt(j)!='a'&& a.toLowerCase().charAt(j)!='e'&& a.toLowerCase().charAt(j)!='i'&&
                       a.toLowerCase().charAt(j)!='o'&& a.toLowerCase().charAt(j)!='u'){
                   j--;
               }
           }
       }
        for(int k=0;k<ch.length;k++){
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}
