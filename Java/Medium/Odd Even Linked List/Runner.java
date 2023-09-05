/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the input linked list,
 * calls the oddEvenList method, and prints the resulting rearranged linked list.
 * The expected output value should be the head node of the rearranged linked list.
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
        
        // Call the oddEvenList method and print the result
        ListNode rearrangedList = solution.oddEvenList(node1);
        while(rearrangedList != null){
            System.out.print(rearrangedList.val + " ");
            rearrangedList = rearrangedList.next;
        }
        
        // The expected output value should be: 1 3 5 2 4
    }
}