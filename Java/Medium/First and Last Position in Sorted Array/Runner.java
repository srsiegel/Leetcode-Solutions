public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the searchRange method
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);

        // Print the expected output value
        System.out.println("Expected output value: [3, 4]");
        // Print the actual output value
        System.out.println("Actual output value: [" + result[0] + ", " + result[1] + "]");
    }
}
