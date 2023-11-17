class Solution{ 
    Node newHead=null;
    Node prev=null;
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root){
        //your code here
        if (root == null) 
            return null;

        convertToCDLL(root);
        if (newHead != null && prev != null) {
            prev.right = newHead;
            newHead.left = prev;
        }
        return newHead;
    }
    
    private void convertToCDLL(Node node) {
        if (node == null) 
            return;

        convertToCDLL(node.left);
        insertNode(node.data);
        convertToCDLL(node.right);
    }

    private void insertNode(int data) {
        if (newHead == null) {
            newHead = new Node(data);
            prev = newHead;
        } 
        else {
            Node curr = new Node(data);
            prev.right = curr;
            curr.left = prev;
            prev = curr;
        }
    }
}
