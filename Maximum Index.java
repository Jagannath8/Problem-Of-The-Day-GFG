

class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        
        int maxDiff;
        
         int RMax[] =  new int[n];
         int LMin[] = new int[n];
         
         
         LMin[0] =  arr[0];
         for(int i =1; i<n;i++){
             LMin[i] = Math.min(LMin[i-1], arr[i]);
         }
         
         
         
         RMax[n-1] = arr[n-1];
         for(int j = n-2; j>=0; j--){
             RMax[j] =  Math.max(RMax[j+1], arr[j]);
         }
         
         
         int i =  0;
         int j = 0;
         
         maxDiff  =  0;
         
         while(i<n && j<n){
             if(LMin[i]<=RMax[j]){
                int diff =  j-i;
                maxDiff = Math.max(maxDiff, diff);
                j++;
             }
             else{
                 i++;
             }
         }
         
         return maxDiff;
    }
}
