class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
          PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            pq.add(A[i]);
        }
        long res=0;
        for(int i=0;i<K;i++){
            res=res+pq.peek();
            pq.add(pq.poll()/2);
        }
        return res;
    }
};

