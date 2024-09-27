package PracticePrograms.Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class LongestUniformString {
    public static void main(String[] args) {
        String str="1115555555500";
        int[] longestString=findLongestString(str);
        System.out.println("index:"+longestString[0]+",length:"+longestString[1]);
    }

    private static int[] findLongestString(String str) {
        int[] result=new int[2];
        int index=0,length=0;
        result[0]=index;
        if(str.length()>0) {
            length = 1;
            result[1] = length;
        }
        else{
            result[1]=length;
            return result;
        }
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length-1;i++){
            if(length>=result[1]) {
                result[0] = index;
                result[1] = length;
            }
            if(charArray[i+1]!=charArray[i]){
                index=i+1;
                length=1;

            }else
                length++;
        }
        return result;
    }
}

