package Scaler.DSA3.LinkedList1_27102023;

public class LongestPalindromLinkedList {
    public static void main(String[] args) {
        Node A=new Node(2);
        Node curr=A;
        Node node1=new Node(1);
        LinkList ll=new LinkList();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node(2));
        curr=ll.add(curr,new Node(1));
        curr=ll.add(curr,new Node(2));
        curr=ll.add(curr,new Node(2));
        curr=ll.add(curr,new Node(1));
        curr=ll.add(curr,new Node(3));
        curr=ll.add(curr,new Node(2));
        curr=ll.add(curr,new Node(2));
        curr=A;
        Node prev=null;
        int ans=0;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            ans=Math.max(ans,2*count(next,prev)+1);
            ans=Math.max(ans,2*count(curr,next));
            prev=curr;
            curr=next;
        }
        System.out.println(ans);
    }

    private static int count(Node next, Node prev) {
        int count=0;
        while(next!=null && prev!=null && next.getData()== prev.getData()){
            count++;
            next=next.next;
            prev=prev.next;
        }
        return count;
    }
}
