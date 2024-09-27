package Scaler.Assignment12072023;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        int A=943566;
        //int A=1;
        char []arr=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuilder title=new StringBuilder("");
        A=A-1;
        while(A>=0){
            int index=A%26;
            title.append(arr[index]);
            A=(A/26);
            A=A-1;


        //    System.out.println(arr[index]);
        }
        System.out.println(title.reverse().toString());
    }
}
