package Scaler.DSA3.LinkedList1_27102023;

import java.util.LinkedList;

public class ReveseLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node curr=head;
        Node node1=new Node(20);
        LinkList ll=new LinkList();
        ll.add(curr,node1);
        ll.add(curr,new Node(30));

       //traverse(head);
    }
}
