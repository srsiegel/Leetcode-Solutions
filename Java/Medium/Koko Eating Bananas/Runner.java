public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the minEatingSpeed method
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = solution.minEatingSpeed(piles, h);

        // Print the expected output value
        System.out.println("Expected output value: 4");
        // Print the actual output value
        System.out.println("Actual output value: " + result);
    }
}
