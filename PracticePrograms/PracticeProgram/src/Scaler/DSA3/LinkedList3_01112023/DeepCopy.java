package Scaler.DSA3.LinkedList3_01112023;


import Scaler.DSA3.LinkedList1_27102023.LinkList;

class Node{
    int val;
    Node next;
    Node random;
    Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;

    }

}

public class DeepCopy {
    static Node head=null;
    static Node insert(int position,int value){
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
        return newNode;
    }

    static int traverse(Node head) {
        int length=0;
        Node curr=head;
        if(curr==null)
            return length;
        while(curr.next!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
            length++;
        }
        System.out.println(curr.val);


        return length+1;
    }

    public static void main(String[] args) {
       Node n1=insert(1,10);
       Node n2=insert(2,20);
       Node n3=insert(3,30);
       Node n4=insert(4,40);
       Node n5=insert(5,50);
       Node n6=insert(6,60);
       Node n7=insert(7,70);
       n2.random=n4;
       n3.random=n7;
       n4.random=n1;
       Node head=n1;
       Node head1=deepCopy(head);



    }

    private static Node deepCopy(Node head) {
        Node curr=head;
        Node temp=curr;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            temp=temp.next;
            curr.next=newNode;
            newNode.next=temp;
            curr=temp;
        }
        curr=head;
        Node head1=curr.next;
        Node curr1=head1;
        while(curr!=null && curr1.next!=null){
            if(curr.random!=null)
                curr1.random=curr.random.next;
            curr1=curr1.next.next;
            curr=curr.next.next;
        }
        curr=head;
        curr1=head1;
        while(curr!=null && curr1.next!=null){
            curr.next=curr.next.next;
            curr=curr.next;
            curr1.next=curr1.next.next;
            curr1=curr1.next;
        }
        traverse(head1);
        return head1;
    }
}
