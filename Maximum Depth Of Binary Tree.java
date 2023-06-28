class Solution {
    public static int maxDepth(Node root) {
    // code here
        return maxDepthRel(root);
    }
  
    public static int maxDepthRel(Node root){
        if(root==null) 
            return 0;
      
        return 1+ Math.max(maxDepthRel(root.left),maxDepthRel(root.right));
    }
}
