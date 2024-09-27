package DataStructure.Dequeue;

public class Dequeue {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public Dequeue() {
        this.firstNode = null;
        this.lastNode=null;
        this.size=0;
    }
    public void insertLeft(String str){
        Node newNode=new Node(str);
        if(this.firstNode==null)
            this.firstNode=this.lastNode=newNode;
        else {
            newNode.setNext(firstNode);
            this.firstNode.setPrev(newNode);
            this.firstNode = newNode;
        }

    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertRight(String str){
        Node newNode=new Node(str);
        if(this.firstNode==null)
            this.firstNode=this.lastNode=newNode;
        if(this.lastNode==null)
            this.firstNode=this.lastNode=newNode;
        else {
            newNode.setPrev(lastNode);
            this.lastNode.setNext(newNode);
            this.lastNode = newNode;
        }
    }
    public void deleteFront(){
        if(firstNode!=null) {
            Node node=firstNode.getNext();
            node.setPrev(null);
            this.firstNode=node;
        }
    }
    public void deleteLast(){
        if(lastNode!=null) {
            Node node=lastNode.getPrev();
            node.setNext(null);
            this.lastNode=node;
        }
    }
    public void traverse(){
       do{
             System.out.println(firstNode.getData());
             firstNode=firstNode.getNext();
        }while(firstNode!=null);
    }

}

