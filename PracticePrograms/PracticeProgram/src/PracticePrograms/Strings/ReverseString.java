package PracticePrograms.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="Geeks";
        str=reverseString(str);
        System.out.println(str);
    }

    private static String reverseString(String str) {
        StringBuilder strB=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            strB.append(str.charAt(i));
        }
        return strB.toString();
    }
}
