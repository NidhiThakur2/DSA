package Scaler.Assignment27032023;

public class CountOccurrence {
    public static void main(String[] args) {
        String A="bobbob";
        String str="bob";
        int start=0,end=2;
        int count=0;
        while(end<=A.length()-1){
            String str1=A.substring(start,end+1);
            if(str1.equals(str))
                count++;
            start++;
            end++;
        }
        System.out.println(count);
    }
}
