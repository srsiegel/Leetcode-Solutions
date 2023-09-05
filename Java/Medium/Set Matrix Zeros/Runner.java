/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input matrix,
 * calls the setZeroes method, and prints the resulting modified matrix.
 * The expected output value should be the modified matrix with rows and columns set to zero based on the presence of zeros.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input matrix
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        // Call the setZeroes method
        solution.setZeroes(matrix);
        
        // Print the modified matrix
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        
        // The expected output value should be:
        // 1 0 1
        // 0 0 0
        // 1 0 1
    }
}