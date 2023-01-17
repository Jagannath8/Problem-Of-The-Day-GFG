class Solution {
    
    int maxgcd;
    int ans;
        
    int maxGCD(Node root) {
        // code here 
        ans=0;
        maxgcd=0;
        dfs(root);
        return ans;
    }
        
    int dfs(Node root){
        if(root==null)
            return 0;
            
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(left!=0 && right!=0){
            int gcd=gcd(left,right);
            if(gcd>maxgcd){
                maxgcd=gcd;
                ans=root.data;
            }
            else if(gcd==maxgcd && root.data>ans){
                ans=root.data;
            }
        }
        return root.data;
    }
        
    int gcd(int a, int b){
        if(a==0)
            return b;
            
        return gcd(b%a, a);
    }
}
