class Solution {
    Node first=null;
    Node prev=null;
    Node second=null;
    public Node correctBST(Node root) {
        // code here.
        BST(root);
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        return root;
    }
    
    void BST(Node root){
        if(root==null)
            return;
            
        BST(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null)
                first=prev;
            
            second=root;
        }
        prev=root;
        BST(root.right);
    }
}
