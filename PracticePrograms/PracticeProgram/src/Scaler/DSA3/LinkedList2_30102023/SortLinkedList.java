package Scaler.DSA3.LinkedList2_30102023;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkList ll=new LinkList();
        //MergeSortLinkedList m2ll=new MergeSortLinkedList();
        Node1 head=new Node1(10);
        Node1 curr=head;
        curr=ll.add(curr,new Node1(2));
        curr=ll.add(curr,new Node1(303));
        curr=ll.add(curr,new Node1(44));
        Node1 n=new Node1(5);
        curr=ll.add(curr,n);
        curr=ll.add(curr,new Node1(19));
        curr=ll.add(curr,new Node1(1));

        Node1 sortedHead=sortLinkedList(head);
        ll.traverse(sortedHead);


    }

    private static Node1 sortLinkedList(Node1 head) {
       if(head==null || head.next==null)
           return head;
        Node1 mid=middleNode(head);
        Node1 head1=mid.next;
        mid.next=null;
        head=sortLinkedList(head);
        head1=sortLinkedList(head1);
        Node1 sortedLL=MergeSortLinkedList.mergeLinkList(head,head1);
        return  sortedLL;
    }

    static Node1 middleNode(Node1 head){
        if(head == null){
            return head;
        }
        Node1 slow=head;
        Node1 fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

            return slow;



    }
}
