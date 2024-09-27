package Scaler.Assignment27032023;

public class AddBinaryString1 {
    public static void main(String[] args) {
        String A="10001100010111000101100010100110001001101010000010011010";
        String B="101111000100100100111110010010101110101001100100101001111010011000000110";
        int nA, nB;
        char res[];
        int i, j, k;
        nA = A.length();
        nB = B.length();
        res = new char[Math.max(nA, nB) + 1];
        k = Math.max(nA, nB);
        i = nA - 1;
        j = nB - 1;
        int sum = 0, carry = 0;
        // we add bits from the rightmost bit to the leftmost bit
        while (i >= 0 || j >= 0 || carry != 0) {
            sum = carry;
            if (i >= 0)
                sum += (A.charAt(i) - '0');
            if (j >= 0)
                sum += (B.charAt(j) - '0');
            res[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            i--;
            j--;
            k--;
        }
        if (res[0] == '1')
            System.out.println(new String(res));
        else {
            int len = Math.max(nA, nB);
            System.out.println(new String(res, 1, len));
        }

    }
}
