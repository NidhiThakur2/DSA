package Scaler.DSA3.LinkedList1_27102023;

public class RemoveNthNode {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node curr=head;
        Node node1=new Node(20);
        LinkList ll=new LinkList();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node(30));
        curr=ll.add(curr,new Node(40));
        curr=ll.add(curr,new Node(50));
        curr=ll.add(curr,new Node(70));
        curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr= curr.next;
        }
        System.out.println(size);
        int pos=25;
        int posFromStart=size-pos;
        int currPos=1;
        curr=head;
        System.out.println(posFromStart);
        if(curr==null)
            System.out.println(curr);
        else if(posFromStart==0)
            System.out.println();
        else if(pos>size){
            //curr=curr.next;
            //head=curr;
            head=head.next;
            LinkList.traverse(head);
        }
        else {
            while (curr.next != null) {

                if (currPos == posFromStart) {
                    Node temp = curr.next;
                    curr.next = temp.next;
                    break;
                }
                currPos++;
                curr = curr.next;
            }
            LinkList.traverse(head);
        }
    }
}
