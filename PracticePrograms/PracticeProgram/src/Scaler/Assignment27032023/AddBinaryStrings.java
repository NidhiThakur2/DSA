package Scaler.Assignment27032023;

public class AddBinaryStrings {
    public static void main(String[] args) {
       // String A="10001100010111000101100010100110001001101010000010011010";
        //String B="101111000100100100111110010010101110101001100100101001111010011000000110";
        String A="1";
        String B="1";
        StringBuilder sbA=new StringBuilder(A);
        StringBuilder sbB=new StringBuilder(B);
        sbA=sbA.reverse();
        sbB=sbB.reverse();
        if(sbA.length()>sbB.length()){
            padZeroRight(sbB,sbA.length());
        }else{
            padZeroRight(sbA,sbB.length());
        }
        StringBuilder result=new StringBuilder();
        int i=0;
        int sum=0,carry=0;
        while(i<sbA.length()){
            sum=0;
            if(sbA.charAt(i)=='1' && sbB.charAt(i)=='1' && carry==1){
                sum=1;
                carry=1;
            }else if(sbA.charAt(i)=='1' && sbB.charAt(i)=='1' && carry==0){
               sum=0;
               carry=1;
            }else{
                if(sbA.charAt(i)=='1' || sbB.charAt(i)=='1')
                    sum=1;
                else
                    sum=0;
                if(sum==1 && carry==1){
                    sum=0;
                    carry=1;
                }else{
                    sum=sum+carry;
                    carry=0;
                }
            }
            if(carry==1 && i==sbA.length()-1){
                result.append(sum).append(carry);
            }else
                result.append(sum);
            i++;
        }
        System.out.println(result.reverse());

    }

    private static void padZeroRight(StringBuilder sbB, int length) {
        for(int i=sbB.length();i<=length-1;i++){
            sbB.append('0');
        }
    }

}
