class Solution{
    public static void rearrange(Node odd){
        // add your code here
        Node even = odd.next;
        Node evenIt = even;
        Node oddIt = odd;
        while(oddIt!=null && oddIt.next!=null){
           oddIt.next = evenIt.next; 
           if(oddIt.next!=null){
                oddIt=oddIt.next;
                evenIt.next = oddIt.next;
                evenIt=evenIt.next;
           }
        }
        oddIt.next = reverse(even);
    }
    
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
