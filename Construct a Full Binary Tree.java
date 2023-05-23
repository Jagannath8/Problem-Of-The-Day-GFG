class Solution{
    public Node constructBTree(int pre[], int preM[], int size){
       if(size==0) return null;
       HashMap<Integer,Integer> pmap = new HashMap<>();
       HashMap<Integer,Integer> mmap = new HashMap<>();
       for(int i=0;i<size;i++){
           pmap.put(pre[i],i);
       }
       for(int i=0;i<size;i++){
           mmap.put(preM[i],i);
       }
       Queue<Node> queue = new LinkedList<>();
       Node root = new Node(pre[0]);
       queue.add(root);
       int count_no_nodes=1;
       while(count_no_nodes<size){
           int n=queue.size();
           while(n>0 && count_no_nodes!=size){
               Node curr= queue.poll();
               int data = curr.data;
               int pre_ind=pmap.get(data);
               int mir_ind=mmap.get(data);
               Node left = new Node(pre[++pre_ind]);
               Node right = new Node(preM[++mir_ind]);
               curr.left=left;
               curr.right=right;
               queue.add(left);
               queue.add(right);
               n--;
               count_no_nodes+=2;
           }
       }
       return root;
    }
}
