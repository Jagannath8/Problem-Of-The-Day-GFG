class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
        //code here
        int pos=0, neg=0, ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                pos=neg=0;
            
            else if(arr[i]>0){
                pos+=1;
                if(neg!=0)
                    neg+=1;
                ans=Math.max(ans, pos);
            }
            
            else{
                int temp=pos;
                pos=neg;
                neg=temp;
                neg+=1;
                if(pos!=0)
                    pos+=1;
                ans=Math.max(ans, pos);
            }
        }
        return ans;
    }
}
