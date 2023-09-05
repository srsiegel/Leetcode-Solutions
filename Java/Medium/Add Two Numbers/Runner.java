public class Runner {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Create two linked lists
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Test the addTwoNumbers method
        ListNode output = solution.addTwoNumbers(l1, l2);
        System.out.println("Expected Output: [7, 0, 8]");
        System.out.print("Actual Output: [");
        while(output != null) {
            System.out.print(output.val);
            if(output.next != null) {
                System.out.print(", ");
            }
            output = output.next;
        }
        System.out.println("]");
    }
}

