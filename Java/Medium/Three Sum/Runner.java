import java.util.List;

/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input array,
 * calls the threeSum method, and prints the resulting list of unique triplets.
 * The expected output value should be a list of lists containing the unique triplets that sum to zero.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input array
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        // Call the threeSum method
        List<List<Integer>> result = solution.threeSum(nums);
        
        // Print the resulting list of unique triplets
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
        
        // The expected output value should be:
        // [-1, -1, 2]
        // [-1, 0, 1]
    }
}