package Scaler.Assignment10042023;

public class KthElementsInLinkedList {
    public static void main(String[] args) {
        Node head=null;
        LinkedList ls=new LinkedList();
        Node firstNode=new Node(12);
        Node node1=new Node(10);
        head=ls.insert(firstNode,head);
        head=ls.insert(node1,head);
        head=ls.insert(new Node(5),head);
        int B=2;
      //  ls.traverse(head);
        int ans=findKthElement(head,B);
        System.out.println(ans);
    }
    private static int findKthElement(Node head, int b) {
        int value=0;
        if(b==0){
            value= head.val;
        }else{
            Node temp=head;
            for(int i=1;i<=b;i++){
                temp=temp.next;
                if(i==b){
                    value= temp.val;
                }
            }
        }
        return value;
    }
}
