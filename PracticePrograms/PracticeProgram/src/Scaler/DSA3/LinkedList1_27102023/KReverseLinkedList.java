package Scaler.DSA3.LinkedList1_27102023;



import java.util.LinkedList;
import java.util.Stack;

public class KReverseLinkedList {
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
        int B=3;
        Stack stack=new Stack<Integer>();
        while(curr!=null){
            Node temp=curr;
            for(int i=1;i<=B;i++){
                stack.push(curr.getData());
                curr=curr.next;
            }
            while(!stack.isEmpty()){
                int num=(int)stack.pop();
                temp.data=num;
                temp=temp.next;
            }

        }
        LinkList.traverse(A);

    }
}
