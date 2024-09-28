//QUESTION-->
//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

//ANSWER-->
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
          HashSet<Character>[] col=new HashSet[9];
            HashSet<Character>[] box=new HashSet[9];

            for(int i=0;i<9;i++){
               rows[i]=new HashSet<>(); 
               col[i]=new HashSet<>(); 
               box[i]=new HashSet<>(); 
            }

            for(int r=0;r<9;r++){
                for(int c=0;c<9;c++){
                    if(board[r][c]=='.'){
                        continue;
                    }

                    char value=board[r][c];
                    int boxIndex = (r / 3) * 3 + (c / 3);

                    if(rows[r].contains(value) || col[c].contains(value) || box[boxIndex].contains(value)){
                        return false;
                    }

                    rows[r].add(value);
                     col[c].add(value);
                      box[boxIndex].add(value);
                }
            }
return true;

    }
}