class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
        int count=0, nonZero=0;
        for(int i=0;i<n;i++)
            if(arr[i]==0){
                if(nonZero!=0) 
                    count++;
                nonZero=0; 
            }
            else
                nonZero++;
        if(nonZero==n)
            return -1;
        else if(nonZero!=0)
            count++;
        return count;
    }
}
