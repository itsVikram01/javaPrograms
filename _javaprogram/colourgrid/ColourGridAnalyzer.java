package java_codes._javaprogram.colourgrid;

public class ColourGridAnalyzer {
    private int[][] grid;
    private int rows, cols;
    private int[] dx = {-1, 0, 1, 0}; // used to get neighbours of a cell
    private int[] dy = {0, 1, 0, -1};

    public ColourGridAnalyzer(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
    }

    /**
     * Returns the size of the largest connected block of nodes with the same color
     * @return int size of the largest block
     */
    public int largestBlock() {
        int maxBlock = 0;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    int block = dfs(i, j, visited);
                    if (block > maxBlock) {
                        maxBlock = block;
                    }
                }
            }
        }
        return maxBlock;
    }

    /**
     * Performs a depth-first search to find the size of the connected block of nodes with the same color
     * @param row int row coordinate of the cell
     * @param col int column coordinate of the cell
     * @param visited boolean[][] keeps track of visited cells
     * @return int size of the connected block of nodes with the same color
     */
    private int dfs(int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        int block = 1;
        for (int k = 0; k < 4; k++) { // check neighbours of the cell
            int x = row + dx[k];
            int y = col + dy[k];
            if (x >= 0 && x < rows && y >= 0 && y < cols && !visited[x][y] && grid[x][y] == grid[row][col]) {
                block += dfs(x, y, visited);
            }
        }
        return block;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1},
                        {1, 2, 2, 2},
                        {2, 2, 2, 1},
                        {1, 1, 1, 1}};
        ColourGridAnalyzer analyzer = new ColourGridAnalyzer(grid);
        int largestBlock = analyzer.largestBlock();
        System.out.println("Largest block size: " + largestBlock);
    }
}

