class Solution 
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int len=0;
    	Node temp=head;
    	
    	while(temp!=null){
    	    temp=temp.next;
    	    len++;
    	}
    	
    	if(len<n)
    	    return -1;
    	    
    	temp=head;
    	
    	for(int i=0;i<len-n;i++){
    	    temp=temp.next;
    	}
    	
    	return temp.data;
    }
}
