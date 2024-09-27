package Scaler.DSA3.LinkedList2_30102023;



class Node{
    int data;
    Node1 next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
    Node(int value, Node1 next){
        this.data=value;
        this.next=next;
    }
}
class LinkList1 {
    Node1 head = null;
    Node1 add(Node1 curr, Node1 newNode){
        curr.next=newNode;
        curr=newNode;
        return curr;
    }


    void insert(int position, int value) {
        Node1 newNode = new Node1(value);
        Node1 curr = head;
        Node1 temp = null;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int i = 1;
            while (i <= position) {
                if (i == position) {
                    temp.next = newNode;
                    newNode.next = curr;
                } else {
                    temp = curr;
                    curr = curr.next;
                }
                i++;
            }
        }
    }
    int traverse(Node1 head) {
        int length=0;
        Node1 curr=head;
        if(curr==null)
            return length;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr=curr.next;
            length++;
        }
        System.out.println(curr.data);
        return length+1;
    }
    boolean isLoopPresent(Node1 head){
        Node1 fast=head;
        Node1 slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    void removeLoop(Node1 head){
        Node1 fast=head;
        Node1 slow=head;

        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
               slow=head;
               break;
            }
        }
        Node1 prev=fast;
        while(fast!=slow) {
            prev=fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next=null;
    }
    Node1 middleNode(Node1 head){
        Node1 slow=head;
        Node1 fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next.next==null)
            return slow.next;
        return slow;
    }
}

public class RemoveLoop {
    public static void main(String[] args) {
        LinkList1 ll=new LinkList1();
        Node1 head=new Node1(10);
        Node1 curr=head;
        curr=ll.add(curr,new Node1(20));
        curr=ll.add(curr,new Node1(30));
        curr=ll.add(curr,new Node1(40));
        Node1 n=new Node1(50);
        curr=ll.add(curr,n);
        curr=ll.add(curr,new Node1(60));
        curr=ll.add(curr,new Node1(70));
       // curr=ll.add(curr,new Node1(80,n));
        boolean isLoopPresent=ll.isLoopPresent(head);
        System.out.println(isLoopPresent);
        if(isLoopPresent){
            ll.removeLoop(head);
        }
        Node1 middle=ll.middleNode(head);
        System.out.println(middle.data);
        //ll.traverse(head);

    }
}
