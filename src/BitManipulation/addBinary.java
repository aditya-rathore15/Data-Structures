package BitManipulation;

/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
 */

/*
ASCII = American Standard Code for Information Interchange

It's just a table that maps characters (like 'A', 'a', '0', '1', '2') to integer codes so computers can store them
as numbers in memory.

So in Java:
    (int)'0' = 48
    (int)'1' = 49
    '0' - '0' = 48 - 48 = 0
    '1' - '0' = 49 - 48 = 0

 */
public class addBinary {
    public static String addBinaryString(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        String result = "";
        int carry = 0;

        while (i>=0 || j>=0 || carry>0) {
            int sum = carry;

            if(i>=0) {
                sum = sum + a.charAt(i) - '0';
                i = i - 1;
            }

            if(j>=0) {
                sum = sum + b.charAt(j) - '0';
                j = j - 1;
            }

            result = (sum % 2) + result;
            carry = sum / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "11";

        System.out.println(addBinaryString(a,b));
    }
}