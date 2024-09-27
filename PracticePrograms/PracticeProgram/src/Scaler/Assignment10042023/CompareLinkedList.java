package Scaler.Assignment10042023;

public class CompareLinkedList {
    public static void main(String[] args) {
        Node head=null;
        Node head1=null;
        LinkedList ls=new LinkedList();
        Node firstNode=new Node(12);
        Node node1=new Node(10);
        head=ls.insert(firstNode,head);
        head=ls.insert(node1,head);
        head=ls.insert(new Node(5),head);

        LinkedList ls1=new LinkedList();
        Node firstNode1=new Node(12);
        Node node2=new Node(10);
        head1=ls1.insert(firstNode1,head1);
        head1=ls1.insert(node2,head1);
        head1=ls1.insert(new Node(5),head1);

        int ans = compareLinkedList(head,head1);
        System.out.println(ans);
    }

    private static int compareLinkedList(Node head, Node head1) {
        Node temp=head;
        Node temp1=head1;
        while(temp!=null && temp1!=null){
            if(temp.val!=temp1.val)
                return 0;
            temp=temp.next;
            temp1=temp1.next;
        }
        if(temp==null && temp1!=null)
            return 0;
        if(temp1==null && temp!=null)
            return 0;
        return 1;

    }
}
