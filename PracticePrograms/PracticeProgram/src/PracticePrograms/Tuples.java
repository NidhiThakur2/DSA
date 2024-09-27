/*Problem Statement:
        Given a string and size of the tuples, extracts all unique tuples(substrings) of the given size.
        Signature:
        HashSet<String>uniqueTuples( String input, int len ){
        }
        Test Cases:
        Input :abbccde, 2
        Output :
        ["ab"
        "bb",
        "bc",
        "cc",
        "cd",
        "de"]*/
package PracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class Tuples {
    public static void main(String[] args) {
        String str="abbccde";
        int len=2;
        Set<String> uniqueTuples=findUniqueTuples(str,len);
        uniqueTuples.stream().forEach(System.out::println);
    }

    private static Set<String> findUniqueTuples(String str, int len) {
        Set<String> uniqueTuples=new HashSet<>();
        StringBuilder strBuilder=new StringBuilder(str);
        for(int i=0;i<str.length()-1;i++){
            String subString=strBuilder.substring(i,i+len);
            uniqueTuples.add(subString);
        }
        return uniqueTuples;
    }
}
