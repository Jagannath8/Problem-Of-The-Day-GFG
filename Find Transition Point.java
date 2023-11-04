class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int l=0, r=n-1;
        int k=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==0)
                l=mid+1;
            else
                r=mid-1;
        }
        
        if(l>k)
            return -1;
        return l;
    }
}
