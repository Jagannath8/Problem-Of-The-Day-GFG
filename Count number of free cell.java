class Solution {
    long[] countZero(int n, int k, int[][] arr){
        // code here
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        int r=n, c=n;
        long ans[]=new long[k];
        long curr=n*n;
        
        for(int i=0;i<k;i++){
            int x=arr[i][0];
            int y=arr[i][1];
            if(!row.contains(x) && !col.contains(y)){
                curr=curr-r-c+1;
                c--;
                r--;
            }
            
            if(row.contains(x) && !col.contains(y)){
                curr=curr-r;
                c--;
            }
            
            if(!row.contains(x) && col.contains(y)){
                curr=curr-c;
                r--;
            }
            
            row.add(x);
            col.add(y);
            ans[i]=curr;
        }
        
        return ans;
    }
}
