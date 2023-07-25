class Spiral{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        solve(root,list);
        return list;
    }
    
    public void solve(Node root , ArrayList<Integer> list){
        Stack<Node> curr = new Stack<>();
        Stack<Node> nextl = new Stack<>();
        boolean flag = true;
        curr.push(root);
        while(!curr.isEmpty()){
            Node temp = curr.pop();
            list.add(temp.data);
            if(flag==true){
                if(temp.right!=null){
                    nextl.push(temp.right);
            }
            if(temp.left!=null)
                nextl.push(temp.left);
        }
        
        else{
            if(temp.left!=null)
                nextl.push(temp.left);
            if(temp.right!=null)
                nextl.push(temp.right);
        }
        
        if(curr.isEmpty()){
            flag = !flag;
            Stack<Node> s  = curr;
            curr = nextl;
            nextl = s;
        }
         
        }
    }
}
