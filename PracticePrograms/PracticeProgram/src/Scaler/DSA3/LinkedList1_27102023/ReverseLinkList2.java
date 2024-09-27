package Scaler.DSA3.LinkedList1_27102023;

import java.util.Stack;

public class ReverseLinkList2 {
    public static void main(String[] args) {
        Node A=new Node(1);
        Node curr=A;
        Node node1=new Node(2);
        LinkList ll=new LinkList();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node(3));
        curr=ll.add(curr,new Node(4));
        curr=ll.add(curr,new Node(5));
        curr=ll.add(curr,new Node(6));
        curr=A;
        int B=1;
        int C=6;
        for(int i=1;i<B;i++){
            curr=curr.next;
        }
        Stack stack=new Stack();
        Node temp=curr;
        for(int i=B;i<=C;i++){
            stack.push(curr.getData());
            curr=curr.next;

        }
        while(!stack.isEmpty()){
            temp.data=(int)stack.pop();
            temp=temp.next;
        }
        LinkList.traverse(A);
    }
}
