class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (result.size() < m * n) {
            // left -> right
            if (top <= bottom) {
                for (int col = left; col <= right; col++) {
                    result.add(matrix[top][col]);
                }
                top++;
            }

            // top -> bottom
            if (left <= right) {
                for (int row = top; row <= bottom; row++) {
                    result.add(matrix[row][right]);
                }
                right--;
            }

            // right -> left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // bottom -> top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }
}