package Scaler.DSA3.LinkedList1_27102023;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node curr=head;
        Node node1=new Node(10);
        LinkList ll=new LinkList();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node(10));
        curr=ll.add(curr,new Node(10));
        curr=ll.add(curr,new Node(60));
        curr=ll.add(curr,new Node(60));
        curr=ll.add(curr,new Node(60));
        curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr= curr.next;
        }
        curr=head;
        Node currNext=head.next;
        if(currNext==null){
            System.out.println();
        }
        else {
            while (currNext.next != null) {
                if (curr.getData() == currNext.getData()) {
                    currNext=currNext.next;
                }else{
                    curr.next = currNext;
                    curr = curr.next;
                    currNext=currNext.next;
                }
            }
            if(curr.getData()==currNext.getData())
                curr.next=null;
            LinkList.traverse(head);
        }
    }

}
