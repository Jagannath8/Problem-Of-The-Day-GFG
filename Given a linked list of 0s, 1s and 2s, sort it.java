class Solution{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head){
        // add your code here
        Node curr=head;
        int count[]=new int[3];
        while(curr!=null){
            int i=curr.data;
            count[i]++;
            curr=curr.next;
        }
        
        Node temp=head;
        for(int i=0;i<3;i++){
            while(count[i]>=1 && temp!=null){
                temp.data=i;
                temp=temp.next;
                count[i]--;
            }
            
        }
        return head;
    }
}
