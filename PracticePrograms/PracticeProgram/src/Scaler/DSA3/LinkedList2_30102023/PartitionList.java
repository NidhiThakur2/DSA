package Scaler.DSA3.LinkedList2_30102023;

import java.util.Stack;

public class PartitionList {
    public static void main(String[] args) {
        LinkList2 ll1=new LinkList2();
        Node1 A=new Node1(1);
        Node1 head=A;
        Node1 curr=head;
        curr=ll1.add(curr,new Node1(2));
        curr=ll1.add(curr,new Node1(3));
        curr=ll1.add(curr,new Node1(4));
        curr=ll1.add(curr,new Node1(5));
        curr=ll1.add(curr,new Node1(6));
        curr=head;
        int B=1;
        Stack<Node1> lessThan=new Stack<>();
        Stack<Node1> greaterThan =new Stack<>();
        if(curr==null || curr.next==null)
            System.out.println(A.getData());
        while(curr!=null){
            if(curr.getData()<B)
                lessThan.push(curr);
            if(curr.getData()>=B)
                greaterThan.push(curr);
            curr=curr.next;
        }
        Node1 lessThanHead=null;
        Node1 lessThanTail=null;
        while(!lessThan.isEmpty()){
            Node1 temp=lessThan.pop();
            temp.next=lessThanHead;
            if(lessThanHead==null)
                lessThanTail=temp;
            lessThanHead=temp;
        }
        LinkList2.traverse(lessThanHead);
        Node1 greaterThanHead=null;
        while(!greaterThan.isEmpty()){
            Node1 temp=greaterThan.pop();
            temp.next=greaterThanHead;
            greaterThanHead=temp;
        }
        LinkList2.traverse(greaterThanHead);
        if(lessThanTail!=null)
            lessThanTail.next=greaterThanHead;
        else
            lessThanHead=greaterThanHead;
        LinkList2.traverse(lessThanHead);

    }
}
