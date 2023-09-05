public class Runner {
    public static void main(String[] args) {
        // Create an instance of the MyLinkedList class
        MyLinkedList obj = new MyLinkedList();

        // Perform various operations on the linked list
        int valueAtIndex2 = obj.get(2); // Get the value at index 2
        obj.addAtHead(1); // Add a node with value 1 at the head
        obj.addAtTail(3); // Add a node with value 3 at the tail
        obj.addAtIndex(1, 2); // Add a node with value 2 at index 1
        obj.deleteAtIndex(1); // Delete the node at index 1

        // Print the value at index 2
        System.out.println("Value at index 2: " + valueAtIndex2);
        
        // Print the updated linked list
        System.out.print("Linked List: ");
        for (int i = 0; i < obj.size; i++) {
            System.out.print(obj.get(i) + " ");
        }
        System.out.println();
    }
}
