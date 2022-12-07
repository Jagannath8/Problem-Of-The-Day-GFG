class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int k) {
        // Write your code here
        
        return dfs(root, k, new int []{0});
    }
    
    int dfs(Node root, int k, int count[]){
        if(root==null)
            return -1;
        
        int lefty=dfs(root.left,k,count);
        if(lefty!=-1)
            return lefty;
        
        count[0]++;
        if(count[0]==k)
            return root.data;
        
        return dfs(root.right,k,count);
    }
}
