class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        if(head1 == null){
            head1 = newNode;
            return head1;
        }
        
        if(head1.data >= key){
            newNode.next = head1;
            head1 = newNode;
            return head1;
        }
        
        Node curr = head1;
        while(curr.next != null && curr.next.data < key){
            curr = curr.next;
        }
        
        if(curr.next == null){
            curr.next = newNode;
            return head1;
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        return head1;
    }
}
