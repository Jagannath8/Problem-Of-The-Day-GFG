class Solution {
    public static int maximum_profit(int n, int[][] intervals) {
        // code here
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0])
                return a[0]-b[0];
            
            return a[1]-b[1];
        });
        int dp[]=new int[n];
        return rec(0,intervals,n,dp);
    }
    
    static int rec(int index, int intervals[][], int n, int dp[]){
        if(index>=n)
            return 0;
        
        if(dp[index]!=0)
            return dp[index];
            
        int notSel=rec(index+1,intervals,n,dp);
        int nextIndex=findNext(index+1,intervals[index][1],intervals,n);
        int sel=intervals[index][2]+rec(nextIndex,intervals,n,dp);
        return dp[index]=Math.max(sel, notSel);
    }
    
    static int findNext(int i, int prevEnd, int intervals[][], int n){
        while(i<n){
            if(intervals[i][0]>=prevEnd)
                break;
            else
                i++;
        }
        return i;
    }
}
