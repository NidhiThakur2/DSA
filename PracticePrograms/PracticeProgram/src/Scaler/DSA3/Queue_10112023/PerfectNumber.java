package Scaler.DSA3.Queue_10112023;

public class PerfectNumber {
    public static void main(String[] args) {
        int count=0;
        int N=5;
        Queue queue=new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        while(true){
            int num=queue.deQueue();
            //System.out.println(num+":"+isPalindrom(num));
            if(hasEvenDigits(num) && isPalindrom(num)) {
                count++;
                if(count==N) {
                    System.out.println(num);
                    return;
                }
            }
            queue.enQueue(num*10+1);
            queue.enQueue(num*10+2);

        }
    }

    private static boolean isPalindrom(int num) {
        String str=Integer.toString(num);
        StringBuilder strB=new StringBuilder(str);
        String str1=strB.reverse().toString();
        if(str.equals(str1))
            return true;
        return false;
    }

    private static boolean hasEvenDigits(int num) {
        int nod=0;
        while(num!=0){
            nod++;
            num=num/10;
        }
        if(nod%2==0)
            return true;
        return false;
    }
}
