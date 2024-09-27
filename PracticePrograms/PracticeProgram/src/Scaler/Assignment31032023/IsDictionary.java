package Scaler.Assignment31032023;

import java.util.ArrayList;

public class IsDictionary {
    public static void main(String[] args) {
        ArrayList<String> A=new ArrayList<String>();
        String B="qwertyuiopasdfghjklzxcvbnm";
        A.add("fine");
        A.add("none");
        A.add("no");
        /*A.add("ipial");
        A.add("qjqgt");
        A.add("vfnue");
        A.add("vjqfp");
        A.add("eghva");
        A.add("ufaeo");
        A.add("atyqz");
        A.add("chmxy");
        A.add("ccvgv");
        A.add("ghtow");*/
        int ans=0;
        if(A.size()==1)
            ans=1;
        for(int i=0;i<A.size()-1;i++) {
            String str = A.get(i);
            String str1 = A.get(i + 1);
            if(B.indexOf(str.charAt(0)) < B.indexOf(str1.charAt(0))) {
                    ans=1;
            }else if(B.indexOf(str.charAt(0)) == B.indexOf(str1.charAt(0)) &&  str.length()<=str1.length()){
                    ans=1;
            }else{
                    ans=0;
                    break;
            }
        }
        System.out.println(ans);

    }
}

