package basics.carry;

import java.util.ArrayList;
import java.util.List;

/*
Add two numbers represented as arrays of digits (reverse order).

[2, 4, 3] + [5, 6, 4] → [7, 0, 8]


 */
public class problem1 {

    public static void main(String[] args) {
        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};

        add(a, b);
    }

    public static void add(int[] a, int[] b) {
        int i = 0;
        int carry = 0;

        List<Integer> result = new ArrayList<>();

        while(i<a.length || i<b.length || carry!=0) {
            int x = (i<a.length) ? a[i] : 0;
            int y = (i<b.length) ? b[i] : 0;

            int sum = x + y + carry;
            result.add(sum % 10);
            carry = sum / 10;
            i++;
        }

        System.out.println(result);
    }
}