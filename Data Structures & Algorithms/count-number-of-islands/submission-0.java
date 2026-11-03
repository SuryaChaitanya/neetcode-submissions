class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null)
            return 0;
        
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int count = 0;

        boolean[][] isVisited = new boolean[ROWS][COLS];

        for (int i = 0; i< ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (isVisited[i][j] == true || grid[i][j] == '0') {
                    continue;
                }
                else if (isVisited[i][j] == false && grid[i][j] == '1'){
                    count++;
                    dfs(grid, isVisited, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] isVisited, int i, int j) {
        if (i >= 0 && i < grid.length && j >=0 && j < grid[0].length && grid[i][j] == '1' && isVisited[i][j] == false) {
            isVisited[i][j] = true;
            dfs(grid, isVisited, i+1, j);
            dfs(grid, isVisited, i-1, j);
            dfs(grid, isVisited, i, j+1);
            dfs(grid, isVisited, i, j-1);
        } 
    }
}
