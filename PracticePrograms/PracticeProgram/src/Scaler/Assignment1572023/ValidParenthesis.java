package Scaler.Assignment1572023;

import Scaler.Assignment24022023.PrefixSum;

import java.util.ArrayList;

public class ValidParenthesis {
    static ArrayList<String> result=new ArrayList<String>();
    public static void main(String[] args) {
        int A=5;
        validParenthesis(A,"",0,0);
        result.stream().forEach(System.out::println);

    }

    private static void validParenthesis(int a, String s, int o, int c) {
        if(s.length()==2*a) {
            result.add(s);

        }
        if(o<a)
            validParenthesis(a,s+"(",o+1,c);
        if(c<o)
            validParenthesis(a,s+")",o,c+1);


    }
}
