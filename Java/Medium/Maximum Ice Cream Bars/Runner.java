public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the maxIceCream method
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        int result = solution.maxIceCream(costs, coins);

        // Print the expected output value
        System.out.println("Expected output value: 4");
        // Print the actual output value
        System.out.println("Actual output value: " + result);
    }
}
