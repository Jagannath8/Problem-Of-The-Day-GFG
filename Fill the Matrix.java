class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		//code here
		int ans=0;
		for(int i=1;i<=N;i++){
		    for(int j=1;j<=M;j++){
		        ans=Math.max(ans, Math.abs(x-i)+Math.abs(y-j));
		    }
		}
		return ans;
	}
}
