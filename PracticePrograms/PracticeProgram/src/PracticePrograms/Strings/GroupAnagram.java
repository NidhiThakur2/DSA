package PracticePrograms.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class GroupAnagram {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("cat");
        stringList.add("dog");
        stringList.add("god");
        stringList.add("madam");
        stringList.add("tac");
        Set<Set<String>> anagramStringList = getGroupAnagram(stringList);
        anagramStringList.stream().forEach(System.out::println);
    }

    private static Set<Set<String>> getGroupAnagram(List<String> stringList) {
        Set<Set<String>> anagramStringList = new HashSet<>();
        for (int i = 0; i <= stringList.size() - 1; i++) {
            Set<String> innerSet = new HashSet<>();
            innerSet.add(stringList.get(i));
            StringBuilder strBuilderReverse = new StringBuilder(stringList.get(i)).reverse();
            String strReverse = new String(strBuilderReverse);
            if (stringList.contains(strReverse)) {
                innerSet.add(strReverse);
                stringList.remove(strReverse);
            }
            anagramStringList.add(innerSet);
        }
        return anagramStringList;
    }
}

