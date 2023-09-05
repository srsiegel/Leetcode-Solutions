/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input array and k value,
 * calls the topKFrequent method, and prints the resulting list of top k frequent words.
 * The expected output value should be a list containing the top k frequent words.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input array and k value
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        
        // Call the topKFrequent method
        List<String> result = solution.topKFrequent(words, k);
        
        // Print the resulting list of top k frequent words
        for (String word : result) {
            System.out.println(word);
        }
        
        // The expected output value should be:
        // i
        // love
    }
}