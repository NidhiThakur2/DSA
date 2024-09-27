package PracticePrograms.Arrays;

public class MajorityElementBoyerMoore {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4};
        int count=0;
        Integer element=null;
        for(int i=0;i<arr.length;i++){
            if(count==0)
                element=arr[i];
           if(element==arr[i])
               count++;
           else
               count--;
        }
     /*   count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==element)
               count++;
           else
               count--;

       }*/
       if(count>= arr.length/2)
           System.out.println(element);
       else
           System.out.println(-1);

    }
}
