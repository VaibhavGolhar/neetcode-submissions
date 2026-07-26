class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == '.') continue;
                if (!isValid(board, i, j)) return false;
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int x, int y){
        char num = board[x][y];

        for (int i = x + 1; i < 9; i++){
            if (board[i][y] == num) return false;
        }

        for (int j = y + 1; j < 9; j++){
            if (board[x][j] == num) return false;
        }

        int subRow = (x / 3) * 3;
        int subCol = (y / 3) * 3;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (subRow + i == x && subCol + j == y) continue;
                if (board[subRow + i][subCol + j] == num) return false;
            }
        }

        return true;
    }
}