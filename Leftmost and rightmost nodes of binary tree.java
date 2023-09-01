class Tree{
    public static void printCorner(Node node){
        // add your code here  
        Queue<Node> q=new LinkedList<>();
        Node prev=new Node(-1);
        q.add(node);
        q.add(null);
        while(q.size()!=1){
            Node x=q.poll();
            if(x==null){
                System.out.print(q.peek().data + " ");
                q.add(null);
                prev=q.peek();
                continue;
            }
            if(q.peek()==null && x!=prev)
                System.out.print(x.data + " ");
            if(x.left!=null)
                q.add(x.left);
            if(x.right!=null)
                q.add(x.right);
        }
    }
}
