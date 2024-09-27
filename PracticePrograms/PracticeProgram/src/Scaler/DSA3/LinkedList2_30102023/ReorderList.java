package Scaler.DSA3.LinkedList2_30102023;

import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        Node1 A=new Node1(1);
        Node1 curr=A;
        Node1 node1=new Node1(2);
        LinkList2 ll=new LinkList2();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node1(3));
        curr=ll.add(curr,new Node1(4));
        curr=ll.add(curr,new Node1(5));
        curr=ll.add(curr,new Node1(6));
        curr=ll.add(curr,new Node1(7));
        curr=ll.add(curr,new Node1(8));
        Node1 dummy = new Node1(0);
        dummy.next = A;
        curr = dummy;
        Node1 reversedA=reorder(A);
        LinkList2.traverse(reversedA);
    }

    private static Node1 reorder(Node1 a) {
        Stack stack=new Stack();
        Node1 curr=a;
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        curr=a;
        int size=stack.size();
        System.out.println(size);
        for(int i=1;i<=size/2;i++){
            Node1 temp=(Node1)stack.pop();
            temp.next=curr.next;
            curr.next=temp;
            System.out.println(curr.getData());
            System.out.println(curr.next.getData());
            curr=curr.next.next;
        }
        if(size%2!=0) {
            Node1 temp = (Node1) stack.pop();
            curr.next=temp;
            temp.next=null;
        }else{
            curr.next=null;
        }
        return a;
    }
}
