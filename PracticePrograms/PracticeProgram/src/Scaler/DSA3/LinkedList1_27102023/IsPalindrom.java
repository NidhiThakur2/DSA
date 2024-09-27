package Scaler.DSA3.LinkedList1_27102023;

import java.util.LinkedHashMap;

public class IsPalindrom {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node curr=head;
        Node node1=new Node(20);
        LinkList ll=new LinkList();
        curr=ll.add(curr,node1);
        curr=ll.add(curr,new Node(30));
        curr=ll.add(curr,new Node(20));
        curr=ll.add(curr,new Node(10));
        int len=LinkList.traverse(head);
        int div=0;
        if(len%2==0){
            div=len/2;
        }else{
            div=(len+1)/2;
        }
        curr=head;
        Node head1=null;
        for(int i=1;i<=div;i++){
            if(i==div){
                head1=curr.next;
                curr.next=null;
            }else{
                curr=curr.next;
            }
        }
        int len1=LinkList.traverse(head);
        int len2=LinkList.traverse(head1);
        int ans=1;
        curr=head;
        Node curr1= LinkList.reverse(head1);
        for(int i=1;i<=len2;i++){
            if(curr.data!=curr1.data){
                ans=0;
            }else{
                curr=curr.next;
                curr1=curr1.next;
            }

        }
        System.out.println(ans);


    }
}
