package Scaler.Assignment10042023;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class LinkedList{
    public  Node insert(Node newNode,Node head){
        newNode.next=head;
        return newNode;
    }

    public Node insertByPosition(Node head,int B,int C){
        Node prev=null;
        Node curr=head;

        int count=1;
        Node newNode=new Node(5);
        if(C==0){
            prev=null;
            newNode.next=curr;
            head=newNode;
            return head;

        }
        while (curr!=null){
            prev=curr;
            curr=curr.next;
            if(count==C){
                prev.next=newNode;
                newNode.next=curr;
                return head;
            }
            count++;
        }
        prev.next=newNode;
        newNode.next=curr;
        return head;
    }
    public  void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}

public class InsertLinkedList {
    public static void main(String[] args) {
        Node head=null;
        LinkedList ls=new LinkedList();
        Node firstNode=new Node(12);
        Node node1=new Node(10);
        head=ls.insert(firstNode,head);
        head=ls.insert(node1,head);
       // ls.traverse(head);
        head=ls.insertByPosition(head,5,9);
        ls.traverse(head);

    }
}
