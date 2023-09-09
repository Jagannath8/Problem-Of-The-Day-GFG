class Solution{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K){
        //Your code here
        ArrayList<Integer> li=new ArrayList<>();
        int num=0;
        inOrder(li,root);
        for(int i=li.size()-1;i>=K-1;i--){
            num=li.get(i);
        }
        return num;
    }
    
    public void inOrder(ArrayList<Integer> li, Node root){
        if(root==null)
            return;
        inOrder(li,root.right);
        li.add(root.data);
        inOrder(li,root.left);
    }
}
