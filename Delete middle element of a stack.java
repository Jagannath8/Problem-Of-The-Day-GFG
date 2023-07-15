class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid=(1+sizeOfStack)/2;
        s.remove(--mid);
    } 
}
