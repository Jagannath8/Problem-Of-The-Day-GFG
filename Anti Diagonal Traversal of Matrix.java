class Solution{
    public int[] antiDiagonalPattern(int[][] matrix){
        // Code here
        int n=matrix.length, count=0;
        int ans[]=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                ans[count++]=matrix[j][i-j];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                ans[count++]=matrix[j][n-j+i-1];
            }
        }
        return ans;
    }
}
