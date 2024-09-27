package Scaler.DSA3.Stack1_06112023;

class Node{
    char ch;
    Node next;
    Node(char ch){
        this.ch=ch;
        this.next=null;
    }
}

public class Stack {
    int size=0;
    Node head=null;
    public void push(Node node){
        node.next=head;
        head=node;
        size++;

    }
    public Node pop(){
        Node ans=null;
        if(size!=0) {
            ans=head;
            head = head.next;
            size--;
        }
        return ans;
    }
    public Node peek(){
        Node ans=null;
        if(size!=0) {
            ans=head;
        }
        return ans;
    }

}
