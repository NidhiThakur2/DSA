package Scaler.DSA3.LinkedList2_30102023;

public class FlattenALinkedList {
    static class Node2{
        int val;
        Node2 right,down;
        Node2(int x){
            this.val=x;
            right=down=null;
        }
    }
    public static void main(String[] args) {
        Node2 head=new Node2(1);
        Node2 curr=head;
        curr.right=new Node2(2);
        Node2 head1=new Node2(3);
        Node2 curr2=head1;
        curr2.right=new Node2(4);
        curr2=curr2.right;
        curr2.right=new Node2(5);
        curr2=curr2.right;
        curr2.right=new Node2(6);
        curr.down=head1;
        curr=head;
        Node2 head3=new Node2(-1);
        while(curr!=null && curr.right!=null){
            Node2 temp=curr;
            Node2 temp1=curr.right;
            System.out.println(curr);
            System.out.println(curr.right);
            temp.right=temp.down;
            temp1.right=temp1.down;
            head3=merge(head3,temp,temp1);
            curr=curr.right;
        }
        while(head3!=null){
            System.out.print(head3.val+" ");
            head3=head3.right;
        }
    }

    private static Node2 merge(Node2 head3,Node2 temp, Node2 temp1) {
        Node2 h3=head3;
        Node2 tail=head3;
        while(temp!=null && temp1!=null){
            if(temp.val<=temp1.val){
                tail.right=temp;
                tail=tail.right;
                temp=temp.right;
            }else {
                tail.right = temp1;
                tail=tail.right;
                temp1=temp1.right;
            }
        }
        if(temp!=null) {
            tail.right = temp;
        }
        if(temp1!=null)
            tail.right=temp1;
        return h3.right;
    }
}
