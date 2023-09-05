/**
 * This class represents a solution to the problem of rearranging a singly-linked list
 * such that all the odd-indexed nodes come before the even-indexed nodes.
 * The time complexity of the program is O(n), where n is the number of nodes in the linked list.
 * The space complexity of the program is O(1), as it only uses a constant amount of extra space.
 */
class Solution {
    /**
     * Method to rearrange the linked list such that all the odd-indexed nodes come before the even-indexed nodes.
     * @param head The head node of the linked list
     * @return The head node of the rearranged linked list
     */
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode oddPtr = head;
        ListNode evenHead = head.next;
        ListNode evenPtr = evenHead;
        
        while(evenPtr != null && evenPtr.next != null){
            oddPtr.next = evenPtr.next;
            evenPtr.next = evenPtr.next.next;
            oddPtr = oddPtr.next;
            evenPtr = evenPtr.next;
        }
        oddPtr.next = evenHead;
        return head;
    }
}