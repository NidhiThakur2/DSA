package Scaler.Assignment10042023;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head=null;
        LinkedList ls=new LinkedList();
        head=ls.insert(new Node(10),head);
        head=ls.insert(new Node(12),head);
        head=ls.insert(new Node(13),head);
       // ls.traverse(head);
        head=ls.reverse(head);
        ls.traverse(head);
    }

}
