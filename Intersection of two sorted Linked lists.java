class Solution{
    public static Node findIntersection(Node head1, Node head2){
        // code here.
        Node dummy = new Node(-1);
        Node node = dummy;
        if(head1== null || head2== null) 
            return dummy.next;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data )
                head1 = head1.next; 
            else if(head1.data > head2.data )
                head2 = head2.next; 
            else{
                node.next = new Node(head1.data);
                head1 = head1.next;
                head2 = head2.next;
                node = node.next;
            } 
        }
        return dummy.next;
    }
}
