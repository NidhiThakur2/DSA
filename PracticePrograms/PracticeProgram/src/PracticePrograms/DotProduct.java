package PracticePrograms;

public class DotProduct {
    public static void main(String[] args) {
        int[] array1=new int[]{5,3,2};
        int[] array2=new int[]{5,10,1};
        int dotProduct=findDotProduct(array1,array2);
        System.out.println("Dot Product of 2 arrays are:" +dotProduct);
    }

    private static int findDotProduct(int[] array1, int[] array2) {
        int sum=0;
        if(array1.length!=array2.length) {
            System.out.println("Can not perform operation , Lenght of input arrays are not same");
            return -1;
        }
        for(int i=0;i<array1.length;i++){
            sum=sum+(array1[i]*array2[i]);
        }

        return sum;
    }
}
