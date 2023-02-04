class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1)
            return arr[0];
        
        int icl=arr[0];
        int ecl=0;
        int new_icl=0;
        
        for(int i=1;i<n;i++){
            new_icl=arr[i]+ecl;
            ecl=Math.max(icl,ecl);
            icl=new_icl;
        }
        return Math.max(new_icl, ecl);
    }
}
