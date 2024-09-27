package Scaler.DSA3.LinkedList2_30102023;

 /*class Node{
    int data;
    Node  next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
    Node(int value,Node next){
        this.data=value;
        this.next=next;
    }
}*/
class LinkList {
    Node1 head = null;

    Node1 add(Node1 curr, Node1 newNode) {
        curr.next = newNode;
        curr = newNode;
        return curr;
    }


    void insert(int position, int value) {
        Node1 newNode = new Node1(value);
        Node1 curr = head;
        Node1 temp = null;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int i = 1;
            while (i <= position) {
                if (i == position) {
                    temp.next = newNode;
                    newNode.next = curr;
                } else {
                    temp = curr;
                    curr = curr.next;
                }
                i++;
            }
        }
    }

    int traverse(Node1 head) {
        int length = 0;
        Node1 curr = head;
        if (curr == null)
            return length;
        while (curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
            length++;
        }
        System.out.println(curr.data);
        return length + 1;
    }

}

public class MergeSortLinkedList {

    public static void main(String[] args) {
        LinkList ll=new LinkList();
        Node1 head=new Node1(10);
        Node1 curr=head;
        curr=ll.add(curr,new Node1(20));
        curr=ll.add(curr,new Node1(30));
        curr=ll.add(curr,new Node1(40));
        Node1 n=new Node1(50);
        curr=ll.add(curr,n);
        curr=ll.add(curr,new Node1(60));
        curr=ll.add(curr,new Node1(12));

        LinkList ll1=new LinkList();
        Node1 head1=new Node1(2);
        curr=head1;
        curr=ll1.add(curr,new Node1(5));
        curr=ll1.add(curr,new Node1(6));
        curr=ll1.add(curr,new Node1(7));
        curr=ll1.add(curr,new Node1(8));
        curr=ll1.add(curr,new Node1(9));
        curr=ll1.add(curr,new Node1(14));
        Node1 newHead=mergeLinkList(head,head1);
        ll.traverse(newHead);


    }
    static Node1 mergeLinkList(Node1 A, Node1 B){
        Node1 h3=new Node1(-1);
        Node1 tail=h3;
        while(A!=null && B!=null){
            if(A.data<=B.data){
                tail.next=A;
                tail=tail.next;
                A=A.next;
            }else {
                tail.next = B;
                tail=tail.next;
                B=B.next;
            }
        }
        if(A!=null) {
            tail.next = A;
        }
        if(B!=null)
            tail.next=B;
        return h3.next;
    }
}
