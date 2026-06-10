class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;

        // Find the correct row
        while (i < row && matrix[i][col - 1] < target) {
            i++;
        }

        // If row exceeds, target not present
        if (i == row) return false;

        // Search in that row
        for (int j = 0; j < col; j++) {
            if (matrix[i][j] == target) {
                return true;
            }
        }

        return false;
    }
}
