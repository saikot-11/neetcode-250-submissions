class Solution {
    public int numIslands(char[][] grid) {
        int countOfIslands = 0;
        int [][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, directions, rows, cols, i, j);
                    countOfIslands++;
                }
            }
        }

        return countOfIslands;
    }

    private void dfs(char [][] grid, int [][] directions, int rows, int cols, int x, int y) {
        if (grid[x][y] == '2') {
            return;
        }

        grid[x][y] = '2';

        for (int i = 0; i < 4; i++) {
            int k = x + directions[i][0];
            int l = y + directions[i][1];

            if (isValid(grid, rows, cols, k, l)) {
                dfs(grid, directions, rows, cols, k, l);
            }
        }
    }

    private boolean isValid(char [][] grid, int rows, int cols, int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1';
    }
}
