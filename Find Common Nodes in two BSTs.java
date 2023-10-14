class Solution{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2){
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        inorder(root1,ans,true,map);
        inorder(root2,ans,false,map);
        return ans;
    }
    
    static void inorder(Node root,ArrayList<Integer> ans ,boolean f,HashMap<Integer,Integer> map){
        if(root==null)
            return;
        inorder(root.left,ans,f,map);
        if(f){
            map.put(root.data,map.getOrDefault(root.data,0)+1);
        }
        else{
            if(map.containsKey(root.data)){
                ans.add(root.data);
            }
        }
        inorder(root.right,ans,f,map);
    }
}
