//QUESTION-->
//Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

//ANSWER-->
class Solution {
    public int diagonalSum(int[][] mat) {
        int count=0;
        for(int i=0,j=0;i<mat.length;i++,j++){
            count=count+mat[i][j];
        }

        for(int i=0,j=mat.length-1;i<mat.length;i++,j--){
        if(i!=j){
            count=count+mat[i][j];
        }
        }
        return count;
    }
}