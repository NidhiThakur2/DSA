package PracticePrograms.Strings;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Pangram {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String str=myObj.nextLine();
        List<Character> missingChar=findMissing(str);
        System.out.println("missing characters are:");
        for (char ch:missingChar) {
            System.out.print(ch);
        }

    }

    private static List<Character> findMissing(String str) {
        Set<Character> presentCharacters=str.chars().filter(ch->ch!=' ')
                                            .mapToObj(ch->(char)ch)
                                            .collect(Collectors.toSet());
        presentCharacters.stream().forEach(c->System.out.print(c));
        Boolean[] alphabets= new Boolean[26];
        List<Character> missingCharacters= new ArrayList<>();
        for (char ch:presentCharacters) {
            int index=Character.toLowerCase(ch)-'a';
            alphabets[index]=true;
        }
        int index=0;
        for (Boolean value:alphabets) {
            if(value==null) {
                missingCharacters.add((char)(index+'a'));
            }
            index++;
        }
        return missingCharacters;
    }

}
