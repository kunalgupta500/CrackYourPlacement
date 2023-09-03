public class Solution {
 public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        newNode.next = head; 
        head = newNode;
    }
}

    
}