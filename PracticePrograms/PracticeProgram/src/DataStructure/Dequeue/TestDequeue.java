package DataStructure.Dequeue;

public class TestDequeue {
    public static void main(String[] args) {
        Dequeue dequeue=new Dequeue();

        dequeue.insertRight("Nidhi");
        dequeue.insertLeft("I am ");
        dequeue.insertRight("Thakur");
        dequeue.deleteFront();
        dequeue.deleteLast();
        dequeue.traverse();
    }
}
