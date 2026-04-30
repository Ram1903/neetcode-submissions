class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char current = board[i][j];

                if (current == '.') continue;

                for (int k = 0; k < 9; k++) {
                    if (k != j && board[i][k] == current) {
                        return false;
                    }

                    if (k != i && board[k][j] == current) {
                        return false;
                    }
                }

                int ri = (i / 3) * 3;
                int ci = (j / 3) * 3;

                for (int m = ri; m < ri + 3; m++) {
                    for (int n = ci; n < ci + 3; n++) {

                        if (m == i && n == j) continue;

                        if (board[m][n] == current) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}