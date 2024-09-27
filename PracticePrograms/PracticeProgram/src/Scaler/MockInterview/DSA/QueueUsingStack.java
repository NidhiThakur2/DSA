package Scaler.MockInterview.DSA;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> stack=new Stack<>();
    static int size=0;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            enQueue(i);
        }
        while(!stack.isEmpty())
            System.out.println(deQueue());
    }
    static void enQueue(int a){
        Stack<Integer> auxStack=new Stack<>();
        int size=auxStack.size();
        while(!stack.isEmpty()){
            int  top=stack.pop();
            auxStack.push(top);
        }
        auxStack.push(a);
        size=size+1;
        while(!auxStack.isEmpty()){
            int top=auxStack.pop();
            stack.push(top);
        }
    }
    static int deQueue(){
        if(stack.isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int top=stack.pop();
        size=size-1;
        return top;
    }
}
