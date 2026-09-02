class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int i = 0;
        // int j = matrix[0].length - 1;

        // while (i < matrix.length && j >= 0) {
        //     if (matrix[i][j] == target) {
        //         return true;
        //     }

        //     if (matrix[i][j] > target) {
        //         j--;
        //     } else {
        //         i++;
        //     }
        // }

        // return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int k = mid / cols;
            int l = mid % cols;

            if (matrix[k][l] == target) {
                return true;
            } else if (matrix[k][l] > target) {
                right--;
            } else {
                left++;
            }
        }

        return false;
    }
}
