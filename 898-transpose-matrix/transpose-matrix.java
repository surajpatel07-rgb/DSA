class Solution {
    public int[][] transpose(int[][] matrix) {
        // Old orginal array
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        // new original array
        int newRows = matrix[0].length;
        int newCol = matrix.length;
        int ans[][] = new int[newRows][newCol];
        // main core logic 
        for (int i = 0 ; i<totalRows ; i++){
            for (int j = 0 ; j<totalCols; j++){
                ans[j][i] = matrix [i][j]; 
            }
        }
        return ans; 
        
    }
}