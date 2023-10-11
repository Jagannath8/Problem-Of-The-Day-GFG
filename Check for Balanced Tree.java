class Tree{
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root){
	// Your code here
	    if(root==null)
	        return true;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        int diff=Math.abs(left-right);
        if(diff>1)
            return false;
            
        return isBalanced(root.right) && isBalanced(root.left);
    }
    
    public int getHeight(Node root){
        if(root==null)
            return 0;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(left,right)+1;
    }
}
