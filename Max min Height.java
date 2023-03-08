class Solution{
	long maximizeMinHeight(int n, int k, int w,int [] a)
    {
        //Write your code here
        int high=Integer.MAX_VALUE/4;
        int low=0;
        long ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(a, w, mid, k)){
                low=mid+1;
                ans=(long)Math.max((long)mid, ans);
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
    private boolean isValid(int arr[], int l, int max, int days){
        int water[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i>0)
                water[i]=water[i-1];
                
            int curr=water[i]+arr[i];
            if(i>=l)
                curr-=water[i-l];
            
            if(curr<max){
                water[i]+=max-curr;
                days-=max-curr;
            }
            
            if(days<0)
                return false;
        }
        return true;
    }
}
