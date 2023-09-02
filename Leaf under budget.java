class Solution{
    public int getCount(Node node, int bud){
        //code here  
        Queue<Node> st=new LinkedList<>();
        Queue<Integer> lev=new LinkedList<>();
        st.add(node);
        lev.add(1);
        int count=0;
        while(!lev.isEmpty()){
            Node temp=st.remove();
            int level=lev.remove();
            if(temp.left==null && temp.right==null){
                if(bud-level>=0){
                    bud=bud-level;
                    count++;
                }
                else{
                    break;
                }
            }
            
            else{
                if(temp.left!=null){
                    st.add(temp.left);
                    lev.add(level+1);
                }
                if(temp.right!=null){
                    st.add(temp.right);
                    lev.add(level+1);
                }
            }
        }
        return count;
    }
}
