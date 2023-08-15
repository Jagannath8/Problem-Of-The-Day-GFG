class Solution {
    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int maxm=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==1) 
                count--;
            else 
                count++;
            maxm=Math.max(maxm,count);
            if(count<0) 
                count=0;
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(a[i]==1) 
                count1++;
        }
        return count1+maxm;
    }
}
