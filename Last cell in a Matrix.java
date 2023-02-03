class Solution{
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int i=0, j=0;
        int curr_dir=1, curr_i=0, curr_j=0;
        int dx[]={-1, 0, 1, 0};
        int dy[]={0, 1, 0, -1};
        
        while(i>=0 && i<R && j>=0 &&j<C){
            curr_i=i;
            curr_j=j;
            if(matrix[i][j]==0){
                i+=dx[curr_dir];
                j+=dy[curr_dir];
            }
            else{
                curr_dir=(curr_dir+1)%4;
                matrix[i][j]=0;
                i+=dx[curr_dir];
                j+=dy[curr_dir];
            }
        }
        return new int[] {curr_i, curr_j};
    }
}
