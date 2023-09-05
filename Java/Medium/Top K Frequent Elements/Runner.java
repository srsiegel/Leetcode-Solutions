/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input array and k value,
 * calls the topKFrequent method, and prints the resulting array of top k frequent elements.
 * The expected output value should be an array containing the top k frequent elements.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input array and k value
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        
        // Call the topKFrequent method
        int[] result = solution.topKFrequent(nums, k);
        
        // Print the resulting array of top k frequent elements
        for (int num : result) {
            System.out.print(num + " ");
        }
        
        // The expected output value should be: 1 2
    }
}