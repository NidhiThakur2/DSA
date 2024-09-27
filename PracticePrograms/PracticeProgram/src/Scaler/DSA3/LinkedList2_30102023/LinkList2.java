package Scaler.DSA3.LinkedList2_30102023;
class Node1 {
    int data;
    Node1 next;
    Node1(int value){
        this.data=value;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
public class LinkList2 {
    static Node1 head=null;
    static Node1 add(Node1 curr, Node1 newNode){
        curr.next=newNode;
        curr=newNode;
        // System.out.println("added"+newNode.data);
        return curr;
    }
    static void insert(int position,int value){
        Node1 newNode=new Node1(value);
        Node1 curr=head;
        Node1 temp=null;
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else{
            int i=1;
            while(i<=position){
                if(i==position){
                    temp.next=newNode;
                    newNode.next=curr;
                }else{
                    temp=curr;
                    curr=curr.next;
                }
                i++;
            }
        }
    }
    public static int traverse(Node1 head) {
        int length=0;
        Node1 curr=head;
        if(curr==null)
            return length;
        while(curr.next!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
            length++;
        }
        System.out.println(curr.data);
        return length+1;
    }

    static void delete(int position){
        if(head==null)
            return;
        Node1 curr=head;
        Node1 temp=null;
        int i=1;
        if(position==1){
            head=head.next;
            return;
        }
        while(i<=position && curr!=null){
            if(i==position){
                temp.next=curr.next;
            }
            temp=curr;
            curr=curr.next;
            i++;
        }
    }

    static Node1 reverse(Node1 head){
        Node1 curr=head;
        Node1 prev=null;
        while(curr!=null){
            Node1 temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args) {
        // Node head=null;
        /*Node curr=head;
        Node node1=new Node(20);
        curr=add(curr,node1);
        curr=add(curr,new Node(30));
        head=reverse(head);*/
        insert(1,10);
        insert(2,20);
        insert(3,30);
        insert(2,40);
        //  delete(1);
        //  delete(3);
        //  delete(1);
        // delete(1);
        traverse(head);
    }

}
