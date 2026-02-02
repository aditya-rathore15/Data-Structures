package basics.carry;

import java.util.Arrays;

/*
Increment a number by 1 (classic carry cascade)

[9, 9, 9] → [1, 0, 0, 0]
 */
public class problem2 {
    public static void main(String[] args) {
        int[] digits = {6, 9, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for(int i = digits.length - 1; i>=0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if(carry == 0) {
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = carry;
        return result;
    }
}