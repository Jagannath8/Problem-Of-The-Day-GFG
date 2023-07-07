class Solution{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here 
        int l=n-1;
        int r=0;
        while(l>=0 && r<m){
            if(arr1[l]>arr2[r]){
                long temp=arr1[l];
                arr1[l]=arr2[r];
                arr2[r]=temp;
                l--; r++;
            }
            else
                break;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
