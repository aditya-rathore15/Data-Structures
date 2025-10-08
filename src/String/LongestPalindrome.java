package String;

import java.util.HashMap;
import java.util.Map;

/*
409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can
be built with those letters.

Letters are case-sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for(int freq : map.values()) {
            length += (freq/2)*2;
            if(freq%2 == 1) {
                hasOdd = true;
            }
        }

        return hasOdd ? length+1 : length;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(longestPalindrome(s));
    }
}