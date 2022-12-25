class Solution
{
    public long  MissingNo(int[][] matrix)
    {
        // code here
        int n=matrix.length;
        int x=-1, y=-1;
        long rowSum[]=new long[n];
        long colSum[]=new long[n];
        long ld=0, rd=0;
        
        for(int i=0;i<n;i++){
            ld+=matrix[i][i];
            rd+=matrix[i][n-i-1];
            
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    x=i;
                    y=j;
                }
                rowSum[i]+=matrix[i][j];
                colSum[j]+=matrix[i][j];
            }
        }
        
        long rowS = x==0 ? rowSum[x+1]:rowSum[x-1];
        long colS = y==0 ? colSum[y+1]:colSum[y-1];
        long diff=colS-colSum[y];
        
        if(diff<=0 || diff!=rowS-rowSum[x])
            return -1;
        
        if(x==y)
            ld+=diff;
            
        if(x==n-y-1)
            rd+=diff;
        
        if(ld!=rd)
            return -1;
        
        rowSum[x]+=diff;
        colSum[y]+=diff;
        
        for(int i=0;i<n;i++){
            if(rowSum[i]!=ld || colSum[i]!=rd)
                return -1;
        }
        
        return diff;
    }
}
