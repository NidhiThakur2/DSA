package PracticePrograms.Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String input="oetdg";
        List<String> dictionary=new ArrayList<>() ;
        dictionary.add("to");
        dictionary.add("toe");
        dictionary.add("toes");
        dictionary.add("doe");
        dictionary.add("dog");
        dictionary.add("god");
        dictionary.add("dogs");
        dictionary.add("book");
        dictionary.add("banana");
        List<String> longestWord=findLongestWord(input,dictionary);
        longestWord.stream().forEach(str->System.out.println(str));

    }

    private static List<String> findLongestWord(String input, List<String> dictionary) {
        List<String> longestWord=new ArrayList<>();
        int maxLength=0;
        for(String str:dictionary){
            char[] strCharArray=str.toCharArray();
            boolean found=false;

            for(char ch:strCharArray){
                if(input.indexOf(ch)!=-1){
                    found=true;
                }else{
                    found=false;
                    break;
                }
            }
            if(found==true) {
                if(str.length()>maxLength)
                    maxLength=str.length();
                longestWord.add(str);
            }
        }
        List<String> longestWordList=new ArrayList<>();
        for(String str:longestWord){
            if(str.length()==maxLength)
                longestWordList.add(str);
        }
        return longestWordList;
    }
}
