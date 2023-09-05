/**
 * This class represents a solution to the problem of setting rows and columns to zero in a matrix based on the presence of zeros in the matrix.
 * The time complexity of the program is O(m * n), where m is the number of rows and n is the number of columns in the matrix.
 * The space complexity of the program is O(1), as it only uses a constant amount of extra space.
 */
class Solution {
    /**
     * Method to set rows and columns to zero in the matrix based on the presence of zeros.
     * @param matrix The input matrix
     */
    public void setZeroes(int[][] matrix) {
        // Iterate through the matrix and mark the corresponding row and column with zeros if a zero is found
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c] == 0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        
        // Iterate through the matrix again and set the cell to zero if the corresponding row or column is marked with zero
        for(int r = matrix.length-1; 0 < r ; r--){
            for(int c = matrix[0].length-1; 0 < c ; c--){
                if(matrix[r][0] == 0 || matrix[0][c] == 0){
                    matrix[r][c] = 0;
                }
            }
        }
    }
}