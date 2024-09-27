package Scaler.DSA3.Stack1_06112023;
import java.util.Stack;
public class CheckTwoBracketsExpresssion {
    public static void main(String[] args) {
        String A="-(a+b+c)";
        String B="-a-b-c";
        Stack stackA;
        Stack stackB;
        stackA=openExpression(A);
        stackB=openExpression(B);
    }

    private static Stack openExpression(String str) {
        Stack<Character> expStack=new Stack<>();
        char[] chArr=str.toCharArray();
        for(int i=0;i<chArr.length;){
            if(chArr[i]=='('){
                char temp=expStack.peek();
                while(chArr[i]!=')'){
                    if(temp=='-'){
                       i++;
                       if(chArr[i]=='-')
                           chArr[i]='+';
                    }else{

                    }
                }
            }else{
                expStack.push(chArr[i]);
                i++;
            }
        }
        return null;
    }
}
