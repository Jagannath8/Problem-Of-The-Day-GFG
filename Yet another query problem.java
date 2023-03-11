class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int ans[][]=new int[N][N+1];
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=i;j<N;j++){
                if(A[i]==A[j])
                    count++;
            }
            ans[i][count]++;
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<N;j++)
                ans[i][j]+=ans[i-1][j];
        }
        
        for(int i=0;i<num;i++){
            int l=Q[i][0];
            int r=Q[i][1];
            int k=Q[i][2];
            if(l==0)
                arr.add(ans[r][k]);
            else
                arr.add(ans[r][k]-ans[l-1][k]);
        }
        return arr;
    }
}
