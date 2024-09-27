package Scaler.Assignment27032023;

public class IsAlNum {
    public static void main(String[] args) {
        char[] A={'S', 'c', 'a', 'l', '#', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        for(int i=0;i<A.length;i++){
            int num=A[i];
            if((num>=48 && num<=57) || (num>=65 && num<=90) || (num>=97 && num<=122))
                continue;
            else {
                System.out.println(0);
                break;
            }
        }
        System.out.println(1);
    }
}
