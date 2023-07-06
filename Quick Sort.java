class Solution{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high){
        // code here
        if(low<high){
            int i=partition(arr, low, high);
            quickSort(arr, low, i-1);
            quickSort(arr, i+1, high);
        }
    }
    
    static int partition(int arr[], int low, int high){
        // your code here
        int piv=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<piv){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        int temp=arr[i+1];
        arr[i+1]=piv;
        arr[high]=temp;
        return i+1;
    } 
}
