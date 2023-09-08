class Solution{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root){
       // Your code here
        Node rt=null;
        ArrayList<Integer>ar=new ArrayList<>();
        inorder(root,ar);
        Collections.sort(ar);
        for(Integer i:ar)
            System.out.print(i+" ");
        return rt;
    }
    
    public static void inorder(Node root,ArrayList<Integer>ar){
        if(root==null)
           return;
        else {
            ar.add(root.data);
            inorder(root.left,ar);
            inorder(root.right,ar);
        }
    }
}
