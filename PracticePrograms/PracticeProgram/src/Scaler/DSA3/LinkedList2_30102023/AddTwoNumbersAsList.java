package Scaler.DSA3.LinkedList2_30102023;

//import Scaler.DSA3.LinkedList1_27102023.LinkList;
//import Scaler.DSA3.LinkedList1_27102023.Node;

public class AddTwoNumbersAsList {
    public static void main(String[] args) {
        LinkList2 ll1=new LinkList2();
        Node1 A=new Node1(9);
        Node1 head=A;
        Node1 curr=head;
        curr=ll1.add(curr,new Node1(9));
        curr=ll1.add(curr,new Node1(9));
        curr=head;

        LinkList2 ll2=new LinkList2();
        Node1 A1=new Node1(9);
        Node1 head2=A1;
        Node1 curr1=head2;
        curr1=ll2.add(curr1,new Node1(9));
        curr1=ll2.add(curr1,new Node1(9));
        curr1=head2;

        LinkList2 ll3=new LinkList2();
        int sum=0;
        int carry=0;
        Node1 dummy=new Node1(-1);
        Node1 curr3=dummy;
        while(curr!=null || curr1!=null){
            sum=curr.getData()+curr1.getData()+carry;
            carry=sum/10;
            int digit=sum%10;
            Node1 n=new Node1(digit);
            curr3=ll3.add(curr3,n);
            curr=curr.next;
            curr1=curr1.next;
        }
        if(carry!=0){
            curr3=ll3.add(curr3,new Node1(carry));
        }
        LinkList2.traverse(dummy.next);


    }
}
