public class Solution {
 public void insertAtIndex(int data, int index) {
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Invalid index. The list is not long enough.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    
}