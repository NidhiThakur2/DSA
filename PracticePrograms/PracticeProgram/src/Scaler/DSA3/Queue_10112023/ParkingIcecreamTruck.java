package Scaler.DSA3.Queue_10112023;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ParkingIcecreamTruck {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(-1);
        A.add(-3);
        A.add(5);
        A.add(3);
        A.add(6);
        A.add(7);
        int B=3;
        ArrayList<Integer> C=getParkingSlots(A,B);
        C.stream().forEach(System.out::println);

    }

    private static ArrayList<Integer> getParkingSlots(ArrayList<Integer> a, int b) {
        Deque<Integer> deque=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<b;i++){
            while(!deque.isEmpty() && deque.getLast()<a.get(i))
                deque.removeLast();
            deque.addLast(a.get(i));

        }
        ans.add(deque.getFirst());
        int s=1;
        int e=b;
        while(e<a.size()){
            int incoming=a.get(e);
            while(!deque.isEmpty() && deque.getLast()<incoming)
                deque.removeLast();
            deque.addLast(incoming);
            int outgoing= a.get(s-1);
            if(outgoing==deque.getFirst())
                deque.removeLast();
            ans.add(deque.getFirst());
            s++;
            e++;
        }

        return ans;
    }
}
