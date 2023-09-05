import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * This class represents a solution to the problem of finding the top k frequent elements in an array.
 * The time complexity of the program is O(n log k), where n is the length of the input array and k is the number of frequent elements to find.
 * The space complexity of the program is O(n), as it uses a HashMap to store the frequency of each element.
 */
class Solution {
    /**
     * Custom comparator class to compare integers based on their frequency in the HashMap.
     */
    public class MyComparator implements Comparator<Integer>{
        HashMap<Integer, Integer> map;

        public MyComparator(HashMap<Integer, Integer> map){
            this.map = map;
        }

        /**
         * Compare method to compare two integers based on their frequency in the HashMap.
         * @param num1 The first integer
         * @param num2 The second integer
         * @return The comparison result based on the frequency of the integers
         */
        public int compare(Integer num1, Integer num2){
                Integer num1Freq = map.get(num1);
                Integer num2Freq = map.get(num2);
                return num2Freq.compareTo(num1Freq);
        }
    }
    
    /**
     * Method to find the top k frequent elements in an array.
     * @param nums The input array of integers
     * @param k The number of frequent elements to find
     * @return An array containing the top k frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array and update the frequency in the HashMap
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        // Create a PriorityQueue with a custom comparator to sort the elements based on their frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator(map));

        // Add the elements from the HashMap to the PriorityQueue
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
        }

        // Create an array to store the top k frequent elements
        int[] arr = new int[k];

        // Poll the top k elements from the PriorityQueue and store them in the array
        for(int i = 0; i < k; i++){
            arr[i] = pq.poll();
        }

        // Return the array containing the top k frequent elements
        return arr;
    }
}