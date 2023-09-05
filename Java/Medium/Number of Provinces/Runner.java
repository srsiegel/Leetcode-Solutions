/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input adjacency matrix,
 * calls the findCircleNum method, and prints the resulting number of connected components.
 * The expected output value should be the number of connected components in the graph.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input adjacency matrix
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        
        // Call the findCircleNum method and print the result
        int connectedComponents = solution.findCircleNum(isConnected);
        System.out.println("Number of connected components: " + connectedComponents);
        
        // The expected output value should be 2, as there are two connected components in the graph.
    }
}