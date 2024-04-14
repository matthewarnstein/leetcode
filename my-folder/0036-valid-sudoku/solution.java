class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!validColumn(i, board)) return false;
            if (!validRow(i, board)) return false;
            if (!validSubBox(i, board)) return false;
        }
        return true;
    }

    public boolean validColumn(int col, char[][] board) {
        Set<Integer> digitSet = new HashSet<Integer>();
        boolean valid = true;
        int d = 0;
        for(char[] row : board) {
            char c = row[col];
            if (Character.isDigit(c))
                d = Character.getNumericValue(c);
            else
                continue;
            if (digitSet.contains(d))   
                return false;
            else
                digitSet.add(d);
        }

        return true;

    }

    public boolean validRow(int row, char[][] board) {
        Set<Integer> digitSet = new HashSet<Integer>();
        boolean valid = true;
        int d = 0;
        for(char c : board[row]) {
            if (Character.isDigit(c))
                d = Character.getNumericValue(c);
            else
                continue;
            if (digitSet.contains(d))   
                return false;
            else
                digitSet.add(d);
        }

        return true;
    }

    public boolean validSubBox(int box, char[][] board) {
        Set<Integer> digitSet = new HashSet<Integer>();
        boolean valid = true;
        int d = 0;
        int r = box / 3;
        int c = box % 3;
        
        for (int i = r*3; i < 3+r*3; i++) {
            for (int j = c*3; j < 3+c*3; j++) {
                char ch = board[i][j];
                if (Character.isDigit(ch))
                    d = Character.getNumericValue(ch);
                else
                    continue;
                if (digitSet.contains(d))   
                    return false;
                else
                    digitSet.add(d);
            }
        }

        return true;
    }

}
