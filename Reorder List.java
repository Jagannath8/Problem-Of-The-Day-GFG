/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node reorderlist(Node head) {
        // Your code here
        if(head.next==null)
            return head;
            
        Node fast=head;
        Node slow=head;
        Node prev=null;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        Node revHead=reverse(slow);
        Node startHead=head;
        while(startHead!=null){
            Node startNext=startHead.next;
            Node revNext=revHead.next;
            startHead.next=revHead;
            if(startNext!=null)
                revHead.next=startNext;
            startHead=startNext;
            revHead=revNext;
        }
        
        return head;
        
    }
    
    Node reverse(Node head){
        if(head==null)
            return null;
            
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}
