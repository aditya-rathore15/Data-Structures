package OA;

import java.util.Stack;

/*
Problem: Given an array representing skyscraper heights along a road,
find the largest square area that can fit within the skyline. Each
skyscraper has width 1 and they're placed adjacent to each other.

Examples:
[1, 2, 3, 2, 1] → Output: 4 (2×2 square)
[4, 3, 4] → Output: 9 (3×3 square)
 */
public class Skyline {
    public static long solution(int[] cityLine) {
        int n = cityLine.length;
        long maxArea = 0;

        // Use stack to find largest rectangle for each height efficiently
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : cityLine[i];

            while (!stack.isEmpty() && cityLine[stack.peek()] > currentHeight) {
                int height = cityLine[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                // For a square, side length is min(width, height)
                int side = Math.min(width, height);
                long area = (long) side * side;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
