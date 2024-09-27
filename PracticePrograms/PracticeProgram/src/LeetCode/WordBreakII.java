package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEndOfWord;
    void insert(String word){
        TrieNode currentNode=this;
        for(char ch: word.toCharArray()){
            int index=ch-'a';
            if(currentNode.children[index]==null){
                currentNode.children[index]=new TrieNode();
            }
            currentNode=currentNode.children[index];

        }
        currentNode.isEndOfWord=true;
    }
    boolean search(String word){
        TrieNode currentNode=this;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if(currentNode.children[index]==null)
                return false;
            currentNode=currentNode.children[index];
        }
        return currentNode.isEndOfWord;
    }
}

public class WordBreakII {
    static TrieNode rootTrieNode=new TrieNode();
    public static void main(String[] args) {
        String str="catsanddog";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        for(String s: wordDict){
            rootTrieNode.insert(s);
        }
        List<List<String>> combinations=wordBreak(str);

        combinations.stream().map(word->String.join(" ",word)).collect(Collectors.toList())
                .stream().forEach(System.out::println);
    }

    private static List<List<String>> wordBreak(String str) {
        List<List<String>> result=new ArrayList<>();
        if("".equals(str)){
            result.add(new ArrayList<>());
            return result;
        }
        for(int i=1;i<=str.length();i++){
            if(rootTrieNode.search(str.substring(0,i))){
                for(List<String> suffixCombination:wordBreak(str.substring(i))){
                    suffixCombination.add(0,str.substring(0,i));
                    result.add(suffixCombination);
                }
            }
        }
        return result;
    }
}
