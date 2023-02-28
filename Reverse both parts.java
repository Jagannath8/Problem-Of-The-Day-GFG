class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node curr = head;
        //itr for k-1 times
        for(int i=1; i<k; i++)
        {
            curr=curr.next;
        }
        Node new_head = curr.next;
        curr.next =null;
        
        Node r1 = reverse(head);
        Node r2 = reverse(new_head);
        
        //lets traverse in r1 till last- then pt it to  r2
         curr = r1;
         while(curr.next!=null)
         curr=curr.next;
         
         curr.next = r2;
         
         return r1;
         
        
    }
    static Node reverse(Node head)
    {
        Node curr=head; Node prev=null; Node next=null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev=curr; curr=next;
        }
        return prev;
        
    }
}
