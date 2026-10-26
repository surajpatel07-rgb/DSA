// class Solution {
//     static boolean QisSafe(int rowIndex,int colIndex,int n,char[][] board){
//         int row = rowIndex;
//         int col = colIndex;
//         // left
//         while(col>= 0){
//             if(board[row][col] == 'Q'){
//                 return false;
//             }
//             col--;
//               }
//               //left upper
//              col = colIndex;
//             row = rowIndex;
//         while(colIndex>=0 && rowIndex >=0){
//                 if(board[row][col] =='Q'){
//                     return false;
//                 }
//                 row = row-1;
//                 col = col -1;
//      // left lower
//         while( row < n && col >= 0 ){
//             if(board[row][col] == 'Q'){
//                 return false;
//             }
//             row = row +1;
//             col = col -1;
//         }
        
//           }
//         return true;
//     }  

    
//     static void solve( int n, char[][] board, int colIndex,List<List<String>> ans){
//          // out of bound base case
//          if(colIndex > n){
//             List<String> temp = new ArrayList<>();
//             for(int i = 0 ; i< n; i++){
//                  temp.add(new String(board[i]));
//             return;
//          }
//          // solving one cases bakii recusiron ko dedo

//          for(int rowIndex = 0 ; rowIndex > n; rowIndex++){
//             if(QisSafe(rowIndex,colIndex,n,board)){
//                 board[rowIndex][colIndex] = 'Q';
//                 solve(n,board,colIndex + 1,ans);
//                 // backtrack kr rhe hai aur queen hta rhe hai
//                 board[rowIndex][colIndex] = '.';
//             }

//          }

//          }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         char[][] board = new char[n][n];
//         for( int i =0 ; i< n; i++){
//             Arrays.fill(board[i], '.');
//         }
//         int colIndex = 0;
//         List<List<String>> ans = new ArrayList<>();
//         solve(n,board,colIndex,ans);
//         return ans;
//            }
// }



import java.util.*;

class Solution {

    static boolean QisSafe(int rowIndex, int colIndex, int n, char[][] board) {

        int row = rowIndex;
        int col = colIndex;

        // Left
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        // Left upper diagonal
        row = rowIndex;
        col = colIndex;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        // Left lower diagonal
        row = rowIndex;
        col = colIndex;

        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    static void solve(int n, char[][] board, int colIndex,
                      List<List<String>> ans) {

        // Base case
        if (colIndex == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        // Try each row
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {

            if (QisSafe(rowIndex, colIndex, n, board)) {

                board[rowIndex][colIndex] = 'Q';

                solve(n, board, colIndex + 1, ans);

                // Backtracking
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(n, board, 0, ans);

        return ans;
    }
}
