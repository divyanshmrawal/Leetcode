//QUESTION-->
/*There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.


Example 1:
Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

Example 2:
Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.*/


//ANSWER-->
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // Initialize a 2D array of size m x n with all elements as 0.
        int arr[][] = new int[m][n];

        // Loop through the indices array to increment the rows and columns.
        for (int i = 0; i < indices.length; i++) {
            // Extract the row and column indices from the current pair.
            int lefthand = indices[i][0];
            int righthand = indices[i][1];

            // Increment all elements in the specified row.
            for (int j = 0; j < n; j++) {
                arr[lefthand][j]++;
            }

            // Increment all elements in the specified column.
            for (int j = 0; j < m; j++) {
                arr[j][righthand]++;
            }
        }

        // Initialize a counter to count the number of odd-valued cells.
        int count = 0;

        // Iterate through the 2D array to count the odd values.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the current cell value is odd.
                if ((arr[i][j]) % 2 != 0) {
                    count++;
                }
            }
        }

        // Return the total count of odd-valued cells.
        return count;
    }
}


// Time Complexity:O(m×n+k×(m+n))
// Space Complexity:O(m×n)
