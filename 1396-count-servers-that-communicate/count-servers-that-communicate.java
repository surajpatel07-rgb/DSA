class Solution {
    public int countServers(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       int[] row = new int[m];
       int[] col = new int[n];
       // pehle count krlo servers
       for(int i = 0; i < m; i++){
         for (int j = 0 ; j < n; j++){
            if(grid[i][j] == 1){
                row[i]++;
                col[j]++;
            }
         }
       }
       // count kro jo same col ya row mai ho
       int count = 0;
       for(int i = 0 ; i < m; i++){
         for(int j = 0; j < n; j++){
            if(grid[i][j] == 1){
                if(row[i] > 1 || col[j] > 1 ){
                    count++ ;
                }
            }
         }
       }
       return count; 
    }
}