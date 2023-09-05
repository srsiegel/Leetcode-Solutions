import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * This class represents a solution to the problem of finding the top k frequent words in an array.
 * The time complexity of the program is O(n log k), where n is the length of the input array and k is the number of frequent words to find.
 * The space complexity of the program is O(n), as it uses a HashMap to store the frequency of each word.
 */
class Solution {
    /**
     * Custom comparator class to compare strings based on their frequency in the HashMap.
     */
    public class customComparator implements Comparator<String>{
        HashMap<String, Integer> map;

        public customComparator(HashMap<String, Integer> map){
            this.map = map;
        }
        
        /**
         * Compare method to compare two strings based on their frequency in the HashMap.
         * If the frequencies are equal, the strings are compared lexicographically.
         * @param s1 The first string
         * @param s2 The second string
         * @return The comparison result based on the frequency and lexicographical order of the strings
         */
        @Override
        public int compare(String s1, String s2){
            int s1Freq = map.get(s1);
            int s2Freq = map.get(s2);
            
            if(s1Freq == s2Freq){
                return s1.compareTo(s2);
            } else{
                return Integer.compare(s2Freq, s1Freq);
            }
        }
    }
    
    /**
     * Method to find the top k frequent words in an array.
     * @param words The input array of words
     * @param k The number of frequent words to find
     * @return A list containing the top k frequent words
     */
    public List<String> topKFrequent(String[] words, int k) {
        // Create a HashMap to store the frequency of each word in the array
        HashMap<String, Integer> map = new HashMap<>();
        
        // Iterate through the array and update the frequency in the HashMap
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        // Create a PriorityQueue with a custom comparator to sort the words based on their frequency and lexicographical order
        PriorityQueue<String> pq = new PriorityQueue<>(new customComparator(map));

        // Add the words from the HashMap to the PriorityQueue
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
        }

        // Create a list to store the top k frequent words
        List<String> result = new ArrayList<>();

        // Poll the top k words from the PriorityQueue and add them to the list
        for(int i = 0; i < k; i++){
            result.add(pq.poll());
        }

        // Return the list containing the top k frequent words
        return result;
    }
}