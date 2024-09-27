package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
class Node{
    int key;
    int val;
    int freq;
    Node next;
    Node prev;
    public Node(int key,int val) {
        this.key=key;
        this.val = val;
        this.freq = 1;
    }

}
class DoublyLinkedList{
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    //adding the first Node in list
    public void addFirst(Node node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    //Removing the node from its current position
    public Node remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=null;
        node.prev=null;
        return node;
    }
    //remove node from last position
    public Node removeLast(){
        if(isEmpty())
            return null;
        return remove(tail.prev);
        
    }
    //check the list is empty
    public boolean isEmpty(){
        if(head.next==null)
            return true;
        return false;
    }
}
public class LFUCache {
    int capacity;
    Map<Integer,Node> freqKey=new HashMap<>();//maintain the key and value node mapping to achieve O(1) retrival complexity
    Map<Integer,DoublyLinkedList> freqencyMap=new HashMap<>();
    int minimumFrequency;
    LFUCache(int capacity){
        this.capacity=capacity;
    }
    public int get(int key){
        if(capacity==0)
            return -1;
        if(!freqKey.containsKey(key))
            return -1;
        Node node=freqKey.get(key);
        increaseFrequency(node);
        return node.val;
    }
    public void put(int key,int value){
        if(capacity==0)
            return;
        if(freqKey.containsKey(key)){
            Node node=freqKey.get(key);
            node.val =value;
            freqKey.put(key,node);
            increaseFrequency(node);
            return;
        }
        if(freqKey.size()==capacity){
             DoublyLinkedList list=freqencyMap.get(minimumFrequency);
             Node toRemove=list.removeLast();
             freqKey.remove(toRemove.key);
        }
        Node newNode=new Node(key,value);
        addNodeToFrequencyMap(newNode);
        freqKey.put(key,newNode);
        minimumFrequency=1;
    }
    private void increaseFrequency(Node node) {
        int currentFrequency=node.freq;
        DoublyLinkedList currentFreqNodesList=freqencyMap.get(currentFrequency);
        currentFreqNodesList.remove(node);
        if(!currentFreqNodesList.isEmpty()){
            freqencyMap.remove(currentFrequency);
            if(currentFrequency==minimumFrequency)
                minimumFrequency++;
        }
        node.freq++;
        addNodeToFrequencyMap(node);
    }
   private void addNodeToFrequencyMap(Node node) {
        int newFrequency=node.freq;
        DoublyLinkedList newList=freqencyMap.getOrDefault(newFrequency,new DoublyLinkedList());
        newList.addFirst(node);
        freqencyMap.put(newFrequency,newList);
   }

   public static void main(String[] args) {
        LFUCache lfuCache=new LFUCache(2);
        lfuCache.put(1,2);
        lfuCache.put(1,5);
        lfuCache.put(2,3);
       System.out.println(lfuCache.get(1));
   }
}
