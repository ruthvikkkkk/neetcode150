/** https://leetcode.com/problems/valid-sudoku/
 *  https://neetcode.io/problems/valid-sudoku
 */

class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        for (int i = 0; i < 9; i++) {
            int[] rowValidator = new int[9];
            int[] colValidator = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = Integer.parseInt(board[i][j]+"");
                    if (rowValidator[val-1] == val) {
                        return false;
                    } else {
                        rowValidator[val-1] = val;
                    }
                }

                if (board[j][i] != '.') {
                    int val = Integer.parseInt(board[j][i]+"");
                    if (colValidator[val-1] == val) {
                        return false;
                    } else {
                        colValidator[val-1] = val;
                    }
                }
            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;

    }
}
