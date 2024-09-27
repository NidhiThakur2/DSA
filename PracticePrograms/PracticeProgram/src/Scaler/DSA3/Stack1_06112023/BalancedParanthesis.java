package Scaler.DSA3.Stack1_06112023;

import java.util.ArrayList;
import java.util.Arrays;

public class BalancedParanthesis {
    static String A="(){";
    public static void main(String[] args) {
        int ans=checkBalance(A);
        if(ans==0){
            System.out.println("Not balanced");
        }
        if(ans==1){
            System.out.println("Balanced");
        }
    }

    private static int checkBalance(String a) {
        char[] chArr= A.toCharArray();
        Stack stack=new Stack();
        for(int i=0;i<chArr.length;i++){
            if(chArr[i]=='{'||chArr[i]=='['||chArr[i]=='('){
                Node node=new Node(chArr[i]);
                stack.push(node);
            }else{
                Node temp=stack.pop();
                if(temp!=null) {
                    if (temp.ch == '{') {
                        if (chArr[i] != '}')
                            return 0;
                    }
                    if (temp.ch == '[') {
                        if (chArr[i] != ']')
                            return 0;
                    }
                    if (temp.ch == '(') {
                        if (chArr[i] != ')')
                            return 0;
                    }
                }else{
                    return 0;
                }
            }
        }
        if(stack.pop()!=null)
            return 0;
        return 1;
    }
}
