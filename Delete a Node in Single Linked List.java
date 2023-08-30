class GfG{
    Node deleteNode(Node head, int x){
	// Your code here
	    Node curr=head;
	    if(x==1)
	        return head=curr.next;
	        
	    for(int i=0;i<x-2;i++)
	        curr=curr.next;
	        
	    curr.next=curr.next.next;
	    return head;
    }
}
