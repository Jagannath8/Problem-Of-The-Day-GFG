class Solution{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n){
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==0) 
                    return true;
                if(arr[i]+arr[l]+arr[r]<0) 
                    l++;
                else 
                    r--;
            }
        }
        return false;
    }
}
