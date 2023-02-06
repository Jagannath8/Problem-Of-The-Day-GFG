class Solution
{
    long ans=0;
    Node temp;
    long verticallyDownBST(Node root,int target)
    {
        while(root!=null){
            if(root.data<target)
                root=root.right;
            else if(root.data>target)
                root=root.left;
            else
                break;
        }
        
        if(root==null)
            return -1;
        
        temp=root;
        inOrder(temp,0);
        return ans;
    }
    
    void inOrder(Node node, int dir){
        if(node!=null){
            inOrder(node.left, dir-1);
            inOrder(node.right, dir+1);
            if(node!=temp && dir==0)
                ans+=node.data;
        }
    }
}
