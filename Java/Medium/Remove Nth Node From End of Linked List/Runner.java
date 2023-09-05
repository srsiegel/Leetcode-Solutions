/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input linked list and the position of the node to be removed,
 * calls the removeNthFromEnd method, and prints the resulting modified linked list.
 * The expected output value should be the head node of the modified linked list.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the input linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        // Define the position of the node to be removed
        int n = 2;
        
        // Call the removeNthFromEnd method and print the result
        ListNode modifiedList = solution.removeNthFromEnd(node1, n);
        while(modifiedList != null){
            System.out.print(modifiedList.val + " ");
            modifiedList = modifiedList.next;
        }
        
        // The expected output value should be: 1 2 3 5
    }
}