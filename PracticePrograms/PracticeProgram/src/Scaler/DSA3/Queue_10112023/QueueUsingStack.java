package Scaler.DSA3.Queue_10112023;
import java.util.Stack;

class Queue{
    Stack<Integer> st1;
    Stack<Integer> st2;
    int size=0;
    Queue(){
        st1=new Stack();
        st2=new Stack();
    }
    public void enQueue(int i){
        st1.push(i);
        size++;
    }
    public int deQueue(){
        if(!st2.isEmpty()){
            size--;
            return st2.pop();

        }
        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }
        size--;
        return st2.pop();
    }
    public int front(){
        if(!st2.isEmpty()){
            return st2.peek();
        }
        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }
        return st2.peek();
    }
}
public class QueueUsingStack {


}
