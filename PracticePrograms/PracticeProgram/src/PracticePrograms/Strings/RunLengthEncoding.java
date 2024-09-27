package PracticePrograms.Strings;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str="nnddddhhhhii";
        String encodedString=findEncodedString(str);
        System.out.println(encodedString);
    }

    private static String findEncodedString(String str) {
        char[] charArray=str.toCharArray();
        int index=0,length=0;
        if(str.length()>0)
            length = 1;
        else{
             return "0";
        }
        StringBuilder strBuilder=new StringBuilder();
        for(int i=0;i<charArray.length-1;i++){
            if(i+1==charArray.length-1)
                strBuilder.append(charArray[i]).append(length);
            if(charArray[i+1]!=charArray[i]){
                strBuilder.append(charArray[i]).append(length);
                index=i+1;
                length=1;
            }else
                length++;
        }
        return new String(strBuilder.toString());
    }
}
