//QUESTION-->
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

// Example 1:
// Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
// Output: [15]
// Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

// Example 2:
// Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
// Output: [12]
// Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

// Example 3:
// Input: matrix = [[7,8],[1,2]]
// Output: [7]
// Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

//ANSWER-->
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;  
        
        int i=0,temp=matrix[0][0];
int[]  maxarray= new int[n];

        while(i<n){
            int minval=matrix[i][0];
            for(int j=0;j<m;j++){
                temp=matrix[i][j];
                if(minval>temp){
                    minval=temp;
                }
            }

        maxarray[i]=minval;

        i++;
        }

int max =0;
        for(int k=0;k<n;k++){
            if(max<maxarray[k]){
                max=maxarray[k];
            }
        }

        result.add(max);

        return result;
    }
}
