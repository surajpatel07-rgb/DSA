class Solution {
    static boolean findCell(char[][] board,int[] emptycell){
         for( int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    emptycell[0] = i;
                    emptycell[1] = j;
                   return true;
                }
            }
         }
   return false;
    }
    static boolean sudokusolver(char[][] board){
        int[] emptycell = new int[2];
         if(!findCell(board,emptycell)){
            return true;
         }
         int rowindex  = emptycell[0];
         int colindex = emptycell[1];
         for(int value = 1; value<=9; value++){
            char CharValue = (char)(value + '0');
            if(isSafetoPlace(board,CharValue,rowindex,colindex)){
                board[rowindex][colindex] = CharValue;
              if(sudokusolver(board) == true){
                return true;
              } 
              // backtracking undoo krdo
              board[rowindex][colindex] = '.';
}
         }
         // not able to solve
         return false;
    }
    static boolean isSafetoPlace(char[][] board,char CharValue,int rowindex, int colindex){
        // check for horizontal
        // row indx sab ka  same rhega col change hoga
        for( int col = 0; col<9; col++){
            if(board[rowindex][col] == CharValue){
                return false;
            }
        }
// check for vertical  -> isme ye hora hai ki col index same hai but row index alag alag haii
        for(int row = 0; row<9; row++){
          if(board[row][colindex] == CharValue){
            return false;
          }
        }
  
        // check for 3*3
        // strarting -->> row - row % 3
        // same for col too col -->> col - col % 3
          int startrow = rowindex - rowindex % 3;
          int startcol = colindex - colindex % 3;
          // travel
          for(int i = 0 ;i < 3; i++){
            for(int j = 0; j <3; j++){
                int actualrow = startrow + i;
                int actualcol = startcol +j;
                if(board[actualrow][actualcol] == CharValue){
                    return false;
                }
            }
          }
          // safe hai place krne ke liye
          return true;
    }
    public void solveSudoku(char[][] board) {
        sudokusolver(board);
    }
}