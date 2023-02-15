class Solution{
	int water_flow(int [][] arr, int r, int c) {
		//Write your code here
		boolean ind[][]=new boolean[r][c];
		boolean arab[][]=new boolean[r][c];
		
		for(int i=0;i<c;i++)
		    dfs(arr, ind, 0, i, r, c);
		
		for(int i=0;i<r;i++)
		    dfs(arr, ind, i, 0, r, c);
		
		for(int i=0;i<r;i++)
		    dfs(arr, arab, i, c-1, r, c);
		    
		for(int i=0;i<c;i++)
		    dfs(arr, arab, r-1, i, r, c);
		    
		int ans=0;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(ind[i][j] && arab[i][j])
		            ans++;
		    }
		}
		return ans;
	}
	
	void dfs(int arr[][], boolean vis[][], int i, int j, int r, int c){
	    if(i<0 || i>=r || j<0 || j>=c || vis[i][j]) return; 
	        vis[i][j] = true;
	    if(j+1<c && !vis[i][j+1] && arr[i][j+1] >= arr[i][j]) 
	        dfs(arr, vis, i,j+1, r, c);

	    if(i+1<r && !vis[i+1][j] && arr[i+1][j] >= arr[i][j] ) 
	        dfs(arr, vis, i+1,j, r, c);

	    if(j-1>=0 && !vis[i][j-1] && arr[i][j-1] >= arr[i][j] ) 
	        dfs(arr, vis, i,j-1, r, c);

	    if(i-1>=0 && !vis[i-1][j] && arr[i-1][j] >= arr[i][j] ) 
	        dfs(arr, vis, i-1,j, r, c);
	}
}
