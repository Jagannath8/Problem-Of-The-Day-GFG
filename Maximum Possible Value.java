class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        long min=Integer.MAX_VALUE;
        long stick=0, per=0;
        for(int i=0;i<N;i++){
            if(B[i]%2==1)
                B[i]--;
            if(B[i]>=2)
                min=Math.min(min,A[i]);
            
            stick+=B[i];
            per+=B[i]*A[i];
        }
        
        if(stick%4!=0)
            per-=2*min;
        
        return per;
    }
} 
