package Scaler.DSA3.LinkedList2_30102023;

public class SwapListNodesInPairs {
    public static void main(String[] args) {
        Node1 A=new Node1(1);
        Node1 curr=A;
        Node1 node1=new Node1(2);
        LinkList2 ll=new LinkList2();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node1(3));
        curr=ll.add(curr,new Node1(4));
        Node1 dummy = new Node1(0);
        dummy.next = A;
        curr = dummy;
        LinkList2.traverse(A);
        while(curr.next!=null && curr.next.next!=null){
            Node1 t1=curr.next;
            Node1 t2=curr.next.next;
            t1.next=t2.next;
            t2.next=t1;

            curr.next=t2;
            curr=t1;

        }

        LinkList2.traverse(dummy.next);


    }
}
