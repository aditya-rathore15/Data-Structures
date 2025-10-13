package Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGrid {

    // Direction vectors for the 4 neighbors: up, right, down, left
    private static final int[] dRow = {-1, 0, 1, 0};
    private static final int[] dCol = {0, 1, 0, -1};

    // Check whether (row, col) is within bounds and unvisited
    private static boolean isValid(boolean[][] visited, int row, int col) {
        int totalRows = visited.length;
        int totalCols = visited[0].length;
        return (row >= 0 && col >= 0 &&
                row < totalRows && col < totalCols &&
                !visited[row][col]);
    }

    public static void bfs(int[][] grid, int startRow, int startCol) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        // Enqueue the starting cell and mark it visited
        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        // Continue until all reachable cells have been processed
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            // Process the current cell (e.g., print its value)
            System.out.print(grid[row][col] + " ");

            // Explore each of the 4 neighboring directions
            for (int dir = 0; dir < dRow.length; dir++) {
                int newRow = row + dRow[dir];
                int newCol = col + dCol[dir];

                // If the neighbor is within bounds and not visited, enqueue it
                if (isValid(visited, newRow, newCol)) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };
        bfs(grid, 0, 0);  // Outputs: 1 2 5 3 6 9 4 7 10 13 8 11 14 12 15 16
    }
}
