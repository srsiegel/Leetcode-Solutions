/**
 * This program adds two numbers represented by linked lists.
 * It iterates through the linked lists and calculates the sum of corresponding nodes along with any overflow.
 * The result is stored in a new linked list and returned.
 *
 * Time complexity: O(max(m, n)), where m and n are the lengths of the input linked lists
 * Space complexity: O(max(m, n)), where m and n are the lengths of the input linked lists
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Create a dummy head for the result linked list
        ListNode dummyHead = new ListNode();
        ListNode ptr = dummyHead;
        int overflow = 0;
        
        // Iterate through the linked lists until both are null
        while(l1 != null || l2 != null){
            // If l1/l2 are not null, take their values. Otherwise, use 0
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum and overflow for the current position of the linked lists
            ptr.next = new ListNode((num1 + num2 + overflow) % 10);
            overflow = (num1 + num2 + overflow) / 10;
            ptr = ptr.next;
            
            // Advance the positions of the linked lists
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        // If there is an overflow at the end, add a new node to the linked list to account for it
        if(overflow != 0){
            ptr.next = new ListNode(overflow);
        }
        
        return dummyHead.next;
    }
}
