class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        
        long min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if((Math.log(sum)<=Math.log(N) + Math.log(A[i])))
                min=Math.min(min, A[i]);
        }
        
        return (int)min;
    }
}
