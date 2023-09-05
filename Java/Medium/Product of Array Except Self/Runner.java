/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input array,
 * calls the productExceptSelf method, and prints the resulting array.
 * The expected output value should be an array where each element represents the product of all elements in the input array except the current element.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input array
        int[] nums = {1, 2, 3, 4};
        
        // Call the productExceptSelf method and print the result
        int[] productArray = solution.productExceptSelf(nums);
        for(int i = 0; i < productArray.length; i++){
            System.out.print(productArray[i] + " ");
        }
        
        // The expected output value should be: 24 12 8 6
    }
}