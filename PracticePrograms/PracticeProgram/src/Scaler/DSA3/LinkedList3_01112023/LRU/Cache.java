package Scaler.DSA3.LinkedList3_01112023.LRU;

import java.util.ArrayList;
import java.util.HashMap;

public class Cache {
    LRUOperations lru=new LRUOperations();
    HashMap<Integer,Node> hashMap=new HashMap<>();
    Node head=new Node(-1);
    Node tail=new Node(-1);
    int capacity=5;
    public static void main(String[] args) {


    }
    int get(int key){
        if(hashMap.containsKey(key)){
            Node node=hashMap.get(key);
            lru.delete(node);
            lru.insertAtTail(node,tail);
            return node.val;
        }else{
            return -1;
        }
    }
    void set(int key,int value){
        Node newNode=new Node(value);
        head.next=tail;
        tail.prev=head;
        //hit
        if(hashMap.containsKey(key)){

            lru.insertAtTail(newNode,tail);
            lru.delete(newNode);
        }
        //miss
        else{
            //if cache is full
            if(hashMap.size()==capacity){
                lru.deleteFromHead(head.next);
                hashMap.remove(key);
            }
            hashMap.put(key,newNode);
            lru.insertAtTail(newNode,tail);
        }
    }
    void printCache() {
        lru.printCache(head.next);
        System.out.println();
    }
}
