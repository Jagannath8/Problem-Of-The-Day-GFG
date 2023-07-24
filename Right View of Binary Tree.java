class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> arr=new ArrayList<>();
        if(node==null){
            return arr; 
        }
        
        Queue<Node> q= new LinkedList<>();
        boolean track=false;
        q.add(node);
        q.add(null);
        arr.add(node.data);
        while(!q.isEmpty()){
            Node curr= q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    track=true;
                    q.add(null);
                }
            }
            else{
                if(track==true){
                    arr.add(curr.data);
                    track=false;
                }
                if(curr.right!=null)
                    q.add(curr.right);
                if(curr.left!=null)
                    q.add(curr.left);
            }
        }
        return arr;
    }
}
