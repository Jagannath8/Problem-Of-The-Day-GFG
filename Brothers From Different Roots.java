class Solution{
	public static int countPairs(Node root1, Node root2, int x){
		// Code here
		int count = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root1);
        while(q.size() > 0) {
            Node curr = q.remove();
            if(isPairX(root2, curr.data, x)) 
                count++;
            if(curr.left != null) 
                q.add(curr.left);
            if(curr.right != null) 
                q.add(curr.right);
        }
        return count;
    }
    
    private static boolean isPairX(Node root, int y, int x) {
        if(root == null) 
            return false;
        if(root.data + y == x) 
            return true;
        if(root.data + y > x) 
            return isPairX(root.left, y, x);
        else 
            return isPairX(root.right, y, x);
	}
}
