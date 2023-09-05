import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    /**
     * This program groups anagrams together in a given array of strings.
     * It uses a HashMap to store the sorted version of each string as the key and a list of anagrams as the value.
     * For each string in the array, it sorts the characters, converts it to a string, and checks if it exists in the HashMap.
     * If it exists, it adds the string to the corresponding list of anagrams.
     * If it doesn't exist, it creates a new list and adds the string to it.
     * Finally, it returns the values (lists of anagrams) from the HashMap as the final result.
     *
     * Time complexity: O(n * k * log k), where n is the number of strings in the array and k is the maximum length of a string
     * - Sorting each string takes O(k * log k) time
     * - Iterating through the array and checking/adding to the HashMap takes O(n) time
     * - Constructing the final result takes O(n) time
     *
     * Space complexity: O(n * k), where n is the number of strings in the array and k is the maximum length of a string
     * - The HashMap can store up to n entries, each with a list of anagrams of length k
     * - The final result list can store up to n lists of anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String key = String.valueOf(str);
            
            List<String> result = map.getOrDefault(key, new ArrayList<>(Arrays.asList()));
            result.add(s);
            map.put(key, result);
        }
        
        List<List<String>> finalResult = new ArrayList<>(map.values());
        return finalResult;
    }
}
