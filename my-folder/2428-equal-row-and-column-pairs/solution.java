class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int pairs = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(equals(i,j,grid))
                    pairs++;
            }
        }

        return pairs;
    }

    public boolean equals(int row, int column, int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            if(grid[row][i] != grid[i][column])
                return false;
        }

        return true;
    }
}
