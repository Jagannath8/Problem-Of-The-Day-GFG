class Solution{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        Node ptr = head;
        Node prev = null;
        while(ptr!=null){
            if(map.containsKey(ptr.data)){
                Node temp = ptr.next;
                prev.next = temp;
            }
            else {
                map.put(ptr.data,1);
                prev = ptr;
            }
            ptr = ptr.next;
        }
        return head;
    }
}
