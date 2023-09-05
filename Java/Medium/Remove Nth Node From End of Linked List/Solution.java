/**
 * This class represents a solution to the problem of removing the nth node from the end of a singly-linked list.
 * The time complexity of the program is O(n), where n is the number of nodes in the linked list.
 * The space complexity of the program is O(1), as it only uses a constant amount of extra space.
 */
class Solution {
    /**
     * Method to remove the nth node from the end of a linked list.
     * @param head The head node of the linked list
     * @param n The position of the node to be removed from the end
     * @return The head node of the modified linked list
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode back = head;
        ListNode front = head;
        
        // Move the front pointer n positions ahead
        for(int i = 0; i < n; i++){
            front = front.next;
        }
        
        // If the front pointer becomes null, it means the node to be removed is the head node
        if(front == null){
            return head.next; 
        }
        
        // Move both the back and front pointers until the front pointer reaches the end of the list
        while(front != null && front.next != null){
            back = back.next;
            front = front.next;
        }
        
        // Remove the nth node by updating the next pointer of the (n-1)th node
        back.next = back.next.next;
        return head;
    }
}