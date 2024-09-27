package Scaler.DSA3.LinkedList2_30102023;

import java.util.Stack;

public class LinkListIntersection {
    public static void main(String[] args) {
        LinkList2 ll1=new LinkList2();
        Node1 A=new Node1(1);
        Node1 head=A;
        Node1 curr=head;
        curr=ll1.add(curr,new Node1(2));
        curr=ll1.add(curr,new Node1(3));
        curr=ll1.add(curr,new Node1(4));
        curr=ll1.add(curr,new Node1(5));
        curr=A;
        LinkList2 ll2=new LinkList2();
        Node1 B=new Node1(6);
        Node1 head1=B;
        Node1 curr1=head1;
        curr1=ll2.add(curr1,new Node1(3));
        curr1=ll2.add(curr1,new Node1(4));
        curr1=ll2.add(curr1,new Node1(5));
        curr1=head1;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=curr1;
        Node1 slow=A;
        Node1 fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast.next==null || fast.next.next==null)
            System.out.println();
        else{
           Node1 temp=A;
           while(temp!=slow){
               temp=temp.next;
               slow=slow.next;

           }
           curr.next=null;
           LinkList2.traverse(slow);
        }

    }
}
