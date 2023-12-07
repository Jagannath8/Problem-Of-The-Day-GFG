class Solution{
    static long countSubarrays(int a[], int n, int L, int R)  { 
        // Complete the function
        long count=0,windows=0;
        int left=0;
        for(int right=0;right<n;right++){
            if(a[right]>=L && a[right]<=R) windows=right-left+1;
            else if(a[right]>R){
                windows=0;
                left=right+1;
            }
            count+=windows;
        }
        return count;
    } 
}
