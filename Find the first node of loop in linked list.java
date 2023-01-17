class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node slow=head, fast=head;
        if(head==null || head.next==null)
            return -1;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
                break;
        }
        
        if(slow!=fast)
            return -1;
        
        slow=head;    
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow.data;
    }
}
