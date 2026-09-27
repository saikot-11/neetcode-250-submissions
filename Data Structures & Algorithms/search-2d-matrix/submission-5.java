/**
 * Time Complexity: O(log (n * m))
 * Space Complexity: O(1)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = row * col - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int r = mid / col;
            int c = mid % col;

            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return false;
    }
}
