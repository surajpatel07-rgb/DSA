class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int TotalRows = matrix.length;
        int TotalCols = matrix[0].length;
        int n = TotalRows * TotalCols;
        int row =0;
        int col = TotalCols - 1;
        while(row < TotalRows && col >=0 ){
            if(matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}