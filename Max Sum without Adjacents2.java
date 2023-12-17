class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1)
            return arr[0];
        int a=arr[0];
        int b=Math.max(a, arr[1]);
        for(int i=2;i<n;i++){
            int c=Math.max(b, a+arr[i]);
            a=b;
            b=c;
        }
        return b;
    }
}
