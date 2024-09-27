package Scaler.DSA3.LinkedList3_01112023.LRU;

public class LRUOperations {
    void insertAtTail(Node newNode,Node tail){
        newNode.next=tail;
        newNode.prev=tail.prev;
        tail.prev=newNode;
        newNode.prev.next=newNode;
    }
    void delete(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=null;
        node.prev=null;
    }
    void deleteFromHead(Node headNode){
        delete(headNode);
    }

    void printCache(Node head){
        Node curr=head;
        while(curr.val!=-1){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
    }
}
