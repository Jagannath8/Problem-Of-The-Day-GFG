class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
        long sum = 0;
        ArrayList<Integer> x[]=new ArrayList[2], y[]=new ArrayList[2];
        for(int i=0;i<2;i++){
            x[i]=new ArrayList<>();
            y[i]=new ArrayList<>();
        }
        
        for(int i = 0; i < N; i++) {
            sum += A[i] - B[i];
            if(A[i]%2==0) 
                x[0].add(A[i]);
            else 
                x[1].add(A[i]);

            if(B[i]%2==0) 
                y[0].add(B[i]);
            else 
                y[1].add(B[i]);
                
        }

        if(sum != 0 || x[0].size() != y[0].size())
            return -1;
        
        long ans = 0;
        
        for(int i = 0; i < 2; i++) {
            Collections.sort(x[i]);
            Collections.sort(y[i]);
            for(int j = 0; j < x[i].size(); j++) 
                ans += Math.abs(x[i].get(j) - y[i].get(j)) / 2;
        }
        
        return ans/2 ;
    }
}
