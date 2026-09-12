class Solution {
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = result || backtrack(board, word, i, j, 0, board.length, board[0].length);
                }
            }
        }
        return result;
    }

    private boolean backtrack(char [][] board, String word, int i, int j, int k, int rows, int cols) {
        if (k == word.length()) {
            return true;
        }
        
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] == '-') {
            return false;
        }

        boolean result = false;

        if (word.charAt(k) == board[i][j]) {
            char temp = board[i][j];
            board[i][j] = '-';
            result = result || backtrack(board, word, i+1, j, k+1, rows, cols) || backtrack(board, word, i-1, j, k+1, rows, cols) || backtrack(board, word, i, j+1, k+1, rows, cols) || backtrack(board, word, i, j-1, k+1, rows, cols);
            board[i][j] = temp;
        }

        return result;
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
