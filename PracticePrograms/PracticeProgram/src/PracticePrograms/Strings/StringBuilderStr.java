package PracticePrograms.Strings;

public class StringBuilderStr {
    public static void main(String[] args) {
        String S="NidhiThakurrr";
        int l=3;
        int r=7;
        StringBuffer sb=new StringBuffer(S.substring(l,r+1));
        System.out.println(S.replace(sb.toString(),sb.reverse()));

    }
}
