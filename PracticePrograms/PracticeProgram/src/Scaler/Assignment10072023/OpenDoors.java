package Scaler.Assignment10072023;

public class OpenDoors {
    public static void main(String[] args) {
        int A=5041242;
        boolean arr[]=new boolean[A];
        int count=0;
        for(int i=0;i<A;i++){
            arr[i]=true;
            count++;
        }
        for(int i=1;i<A/2;i++){
            int num=i+1;
            for(int j=i;j<A;j+=num){
                if(arr[j]==true) {
                    arr[j] = false;
                    count--;
                }
                else {
                    arr[j] = true;
                    count++;
                }
            }
        }
        for(int i=A/2;i<A;i++){
            if(arr[i]==true) {
                count--;
            }else{
                count++;
            }

        }
        System.out.println(count);

    }
}
