package Scaler.DSA3.LinkedList1_27102023;
class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

public class LinkList {
    static Node head=null;
    static Node add(Node curr,Node newNode){
        curr.next=newNode;
        curr=newNode;
       // System.out.println("added"+newNode.data);
        return curr;
    }
    static void insert(int position,int value){
       Node newNode=new Node(value);
       Node curr=head;
       Node temp=null;
       if(position==1){
           newNode.next=head;
           head=newNode;
       }else{
           int i=1;
           while(i<=position){
               if(i==position){
                   temp.next=newNode;
                   newNode.next=curr;
               }else{
                   temp=curr;
                   curr=curr.next;
               }
               i++;
           }
       }
    }
    public static int traverse(Node head) {
        int length=0;
        Node curr=head;
        if(curr==null)
            return length;
        while(curr.next!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
            length++;
        }
        System.out.println(curr.data);
        return length+1;
    }

    static void delete(int position){
        if(head==null)
            return;
        Node curr=head;
        Node temp=null;
        int i=1;
        if(position==1){
            head=head.next;
            return;
        }
        while(i<=position && curr!=null){
           if(i==position){
               temp.next=curr.next;
           }
           temp=curr;
           curr=curr.next;
           i++;
        }
    }

    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args) {
       // Node head=null;
        /*Node curr=head;
        Node node1=new Node(20);
        curr=add(curr,node1);
        curr=add(curr,new Node(30));
        head=reverse(head);*/
        insert(1,10);
        insert(2,20);
        insert(3,30);
        insert(2,40);
      //  delete(1);
      //  delete(3);
      //  delete(1);
       // delete(1);
        traverse(head);
    }

}
