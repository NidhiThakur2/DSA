package Scaler.Assignment220223;

public class TimeToEquality {
    public static void main(String[] args) {
        int A[]={2, 4, 1, 3, 2};

        int max=findMax(A);
        int seconds=findSeconds(A,max);
        System.out.println(seconds);

    }

    private static int findSeconds(int[] a, int max) {
        int sum=0;
        int i=0,j=a.length-1;
        while(i<j){
            int diffFront=max-a[i];
            int diffLast=max-a[j];
            sum=sum+(diffFront+diffLast);
            i++;
            j--;
        }
        if(i==j){
            int diff=max-a[i];
            sum=sum+diff;
        }
        return sum;
    }

    private static int findMax(int[] a) {
        int max=a[0];
        int i=0,j=a.length-1;
        while(i<=j){
            if(a[i]>a[j] && a[i]>max){
                max=a[i];
            }else if(a[j]>a[i] && a[j]>max){
                max=a[j];
            }
            i++;
            j--;
        }
        return max;
    }
}
