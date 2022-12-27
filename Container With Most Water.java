class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        int i=0, j=len-1;
        int ans=0;
        while(i<j){
            ans=Math.max(ans, Math.min(A[i],A[j])*(j-i));
            if(A[i]<A[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}
