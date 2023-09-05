public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the minSubArrayLen method
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(target, nums);

        // Print the expected output value
        System.out.println("Expected output value: 2");
        // Print the actual output value
        System.out.println("Actual output value: " + result);
    }
}
