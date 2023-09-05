import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the groupAnagrams method
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);

        // Print the expected output value
        System.out.println("Expected output value: [[eat, tea, ate], [tan, nat], [bat]]");
        // Print the actual output value
        System.out.println("Actual output value: " + result);
    }
}

