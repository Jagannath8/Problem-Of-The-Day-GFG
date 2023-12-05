class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int mini, maxi;
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=k){
                maxi=Math.max(arr[i-1]+k, arr[n-1]-k);
                mini=Math.min(arr[0]+k, arr[i]-k);
                ans=Math.min(ans, maxi-mini);
            }
        }
        return ans;
    }
}
