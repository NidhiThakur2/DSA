package Scaler.Assignment27022023;

public class EvenSubarrays {
    public static void main(String[] args) {
        //int[] A={ 786, 431, 651, 288, 198, 856, 809, 528, 835, 16, 849, 596, 481, 572, 303, 32, 465, 658, 452, 29, 916, 990, 657, 789, 667, 108, 307, 491, 830, 183, 262, 430, 481, 468, 803, 278, 92, 706, 322, 494, 539, 576, 597, 554, 558, 984, 759, 203, 77, 855, 452, 169, 555, 95, 723, 832, 261, 308, 855, 76, 622, 180, 306, 905, 691, 344, 550, 20, 48, 579, 776, 335, 135, 91, 636, 549, 644, 137, 42, 913, 266, 572, 858, 676, 112, 607, 311, 742, 443, 221 };
        int[] A={796, 115, 800, 37, 816, 166, 175, 742, 418, 769, 101, 137, 346, 22, 156, 275, 290, 967, 724, 621, 631, 830, 37, 394, 345, 311, 684, 453, 513, 344, 450, 967, 416, 809, 249, 962, 574, 278, 958, 620, 70, 688 };
        //int[] A={2,4,2,1,3,1};
        String isEvenSubarray=findIsEvenSubarray(A);
        System.out.println(A.length);
        System.out.println(isEvenSubarray);

    }

    private static String findIsEvenSubarray(int[] A) {
        int length=0;
        int remainingLength=A.length;
        if(A.length%2!=0||A[0]%2!=0||A[A.length-1]%2!=0)
            return "NO";
        for(int i=0;i<A.length-1;i++){
            if(A[i]%2==0) {
                length++;
            }else
                return "NO";
            if(length%2==0) {
                remainingLength = A.length - length;
                length=0;
            }
            if(remainingLength%2!=0 && (remainingLength/2)%2!=0) {
                return "NO";
            }

        }
        System.out.println(length);
         return "YES";

    }
}
