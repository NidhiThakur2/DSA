package Scaler.MockInterview.DSA;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()](){";
        boolean isValid = checkExpression(exp);
        System.out.println(isValid);
    }
    private static boolean checkExpression(String exp) {
        Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < exp.length(); i++) {
                char ch = exp.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    char ch1;
                    ch1 = stack.pop();
                    switch (ch) {
                        case ')':
                           if (ch1 != '(')
                                return false;
                           break;
                        case '}':
                            if (ch1 != '{')
                                return false;
                            break;
                        case ']':
                            if (ch1 != '[')
                                return false;
                            break;
                    }
                }
            }
            if(stack.isEmpty())
                return true;
            return false;
        }



}
