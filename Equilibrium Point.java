class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        if(n==1)
            return 1;
        
        for(int i=1;i<n;i++)
            arr[i]+=arr[i-1];
        
        for(int i=1;i<n-1;i++){
            if(arr[i-1]==(arr[n-1]-arr[i]))
                return i+1;
        }
        return -1;
    }
}
