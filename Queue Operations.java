class Geeks{
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        // Your code here
        q.add(k);
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        // Your code here
        int ans = -1;
        int c = 0;
        int n = q.size();
        for(int i =0; i<n;i++){
            int x = q.poll();
            if(x==k){
                c++;
                ans = c;
            }
            
            q.add(x);
        }
        return ans;
    }
}
