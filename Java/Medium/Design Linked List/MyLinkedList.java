class MyLinkedList {

    // Inner class to represent a node in the linked list
    class Node {
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }

    Node head = null;
    Node dummy = null;

    int size = 0;

    /**
     * This program implements a singly linked list with various operations such as getting the value at a given index,
     * adding a node at the head, adding a node at the tail, adding a node at a specific index, and deleting a node at a specific index.
     *
     * Time complexity:
     * - get: O(n), where n is the index of the node to be retrieved
     * - addAtHead: O(1)
     * - addAtTail: O(n), where n is the number of nodes in the linked list
     * - addAtIndex: O(n), where n is the index at which the node is to be added
     * - deleteAtIndex: O(n), where n is the index at which the node is to be deleted
     *
     * Space complexity: O(1)
     */
    public MyLinkedList() {
        dummy = new Node(-1);
        dummy.next = head; 
    }
    
    public int get(int index) {
        if (this.size <= index) return -1;

        Node cur = this.dummy.next;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node tmp = new Node(val);
        tmp.next = dummy.next;
        dummy.next = tmp;
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node cur = dummy;

        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }

        cur.next = new Node(val);
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        Node cur = dummy;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        Node tmp = new Node(val);

        if (cur.next != null) {
            tmp.next = cur.next;
            cur.next = tmp;
        } else {
            cur.next = tmp;
        }
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        Node cur = dummy;

        if (index >= size) return;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        
        cur.next = cur.next.next;
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
