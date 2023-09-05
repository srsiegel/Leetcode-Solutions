public class Runner {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test the intToRoman method
        int input = 1234;
        String output = solution.intToRoman(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
