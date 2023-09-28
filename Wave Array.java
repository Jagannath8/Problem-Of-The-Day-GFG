class Solution {
    public static void convertToWave(int n, int[] arr) {
        // code here
        if(n%2 == 0) 
            n++;
        for(int i=1;i<n-1;i+=2){ 
            if(arr[i-1] < arr[i])
                arr[i-1] = arr[i-1]^arr[i]^(arr[i] = arr[i-1]);
            if(i==n-2) 
                break;
            if(arr[i+1] < arr[i])
                arr[i+1] = arr[i+1]^arr[i]^(arr[i] = arr[i+1]);
        }
    }
}
