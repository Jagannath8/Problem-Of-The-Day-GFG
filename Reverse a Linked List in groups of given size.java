class Solution{
    public static Node reverse(Node node, int k){
        //Your code here
        Node curr=node;
        Node prev=null;
        Node next=null;
        int count=0;
        while(count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        
        if(node!=null)
            node.next=reverse(next,k);
        
        return prev;
    }
}
