import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // Loop through each row and column
        for (int i = 0; i < 9; i++) {
            
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();
            
            for (int j = 0; j < 9; j++) {
                
                // ✅ Check Row
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }
                
                // ✅ Check Column
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
                
                // ✅ Check 3x3 Box
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                
                if (board[rowIndex][colIndex] != '.') {
                    if (boxSet.contains(board[rowIndex][colIndex])) {
                        return false;
                    }
                    boxSet.add(board[rowIndex][colIndex]);
                }
            }
        }
        
        return true;
    }
}