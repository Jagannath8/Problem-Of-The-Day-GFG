class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        int ans=0;
        if(N%2==0) 
            return ans; 
        for(int i=0;i<N;i+=2) 
            ans^=A[i];
        return ans;
    }
};
