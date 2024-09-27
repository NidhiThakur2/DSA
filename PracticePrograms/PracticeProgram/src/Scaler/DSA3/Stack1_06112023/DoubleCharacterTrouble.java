package Scaler.DSA3.Stack1_06112023;

public class DoubleCharacterTrouble {
    static String A="aaaaa";

    public static void main(String[] args) {
        String ans=removeDoubleCharachter(A);
        System.out.println(ans);
    }


    private static String removeDoubleCharachter(String a) {
        char[] chArr=a.toCharArray();
        Stack stack=new Stack();
        char ch;
        for(int i=0;i<chArr.length;i++){
                if(stack.size==0){
                    Node node = new Node(chArr[i]);
                    stack.push(node);
                }
                else {
                    ch = stack.peek().ch;
                    if (ch != chArr[i]) {
                        Node node = new Node(chArr[i]);

                        stack.push(node);
                    } else {
                        stack.pop();
                    }
                }


        }
        if(stack.size==0){
            return "";
        }
        StringBuilder str=new StringBuilder();
        while(stack.size!=0){
            str.append(stack.pop().ch);
        }
        return str.reverse().toString();
    }
}
