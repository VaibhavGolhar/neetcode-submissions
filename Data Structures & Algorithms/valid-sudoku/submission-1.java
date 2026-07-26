class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int i = 0; i < 9; i++){
            int subRow = (i / 3) * 3;
            for (int j = 0; j < 9; j++){
                char num = board[i][j];
                int bit = 1 << (num - '1');
                if (num == '.') continue;
                if ((rows[i] & bit) != 0 || (cols[j] & bit) != 0 || (boxes[subRow + (j / 3)] & bit) != 0) return false;
                rows[i] |= 1 << (num - '1');
                cols[j] |= 1 << (num - '1');
                boxes[subRow + (j / 3)] |= 1 << (num - '1');
            }
        }

        return true;
    }
}