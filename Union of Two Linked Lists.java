class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	     //Add your code here.
	    Set<Integer> set = new TreeSet<>();
	    while(head1!=null)
	    {
	        set.add(head1.data);
	        head1=  head1.next;
	    }
	    
	    while(head2!=null)
	    {
	        set.add(head2.data);
	        head2 =  head2.next;
	    }
	    Node curr=null;
	    Node start = null;
	   
	    for(int x : set)
	    {
	       if(start==null) // will run just once
	       {
	           start = new Node(x);
	           curr = start;
	       }
	       else
	       {
	       curr.next = new Node(x);
	       curr = curr.next;
	       }
	    }
	    return start;
	
	}
}
