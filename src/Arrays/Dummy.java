package Arrays;

import java.util.*;

public class Dummy {
    // Directions: up, right, down, left
    private static final int[] dRow = {-1, 0, 1, 0};
    private static final int[] dCol = {0, 1, 0, -1};

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dist = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Enqueue all 0-cells and initialize their distance to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                    dist[i][j] = 0;
                }
            }
        }

        // Multi-source BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1];

            for (int k = 0; k < 4; k++) {
                int nr = row + dRow[k];
                int nc = col + dCol[k];
                // Check bounds and whether the neighbor has been visited
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                    dist[nr][nc] = dist[row][col] + 1;
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc});
                }
            }
        }

        return dist;
    }
}
