package Scaler.Contest;

public class recurssion {
    public static void main(String[] args) {
        System.out.println(foo(5));
    }

    private static int foo(int x) {
      if(x<=2)
            return x;
        return foo(x-1)+foo(x-2)+foo(x-3);
    }
}
