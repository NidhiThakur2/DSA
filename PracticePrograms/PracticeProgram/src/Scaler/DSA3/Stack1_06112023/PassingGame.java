package Scaler.DSA3.Stack1_06112023;

import java.util.ArrayList;

class IntNode1 {
    int val;
    IntNode1 next;

    IntNode1(int val){
        this.val=val;
        this.next=null;

    }
}
class IntStack1 {
    int size=0;
    IntNode1 head=null;
    public void push(IntNode1 node){
        node.next=head;
        head=node;
        size++;

    }
    public IntNode1 pop(){
        IntNode1 ans=null;
        if(size!=0) {
            ans=head;
            head = head.next;
            size--;
        }
        return ans;
    }
    public IntNode1 peek(){
        IntNode1 ans=null;
        if(size!=0) {
            ans=head;
        }
        return ans;
    }

}


public class PassingGame {
    public static void main(String[] args) {
        int A=10;
        int B=23;
        ArrayList<Integer> C=new ArrayList<>();
       // C.add(2);
        C.add(86);
        C.add(63);
        C.add(60);
        C.add(0);
        C.add(47);
        C.add(0);
        C.add(99);
        C.add(9);
        C.add(0);
        C.add(0);


        int ans=getPossesedId(A,B,C);
        System.out.println(ans);
    }

    private static int getPossesedId(int a, int b, ArrayList<Integer> c) {
        IntStack1 stack=new IntStack1();
        stack.push(new IntNode1(b));
        for(int i=0;i<a;i++){
            if(c.get(i)==0)
               stack.pop();
            else{
                stack.push(new IntNode1(c.get(i)));
            }
        }
        return stack.peek().val;
    }
}
