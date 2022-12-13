class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> num = new ArrayList<Integer>();
        int curr_sum=0, start=0, end=0;
        for(int i=0;i<n;i++){
            curr_sum += arr[i];
            end=i;
            
            while(curr_sum>s){
                curr_sum -= arr[start];
                start++;
            }
            
            if(curr_sum==s)
                break;
        }
        
        if(curr_sum!=s || start>end){
            num.add(-1);
            return num;
        }
        
        else{
            num.add(start+1);
            num.add(end+1);
            return num;
        }
    }
}
