class Solution{
	int minCost(int [][] costs) {
		//Write your code here
		int n=costs.length;
		int k=costs[0].length;
		int dp[][]=new int[n][k];
		if(n>1 && k==1)
		    return -1;
		
		int m1=Integer.MAX_VALUE;
		int m2=Integer.MAX_VALUE;
		
		for(int i=0;i<k;i++){
		    dp[0][i]=costs[0][i];
		    if(costs[0][i]<m1){
		        m2=m1;
		        m1=costs[0][i];
		    }
		    else if(costs[0][i]<m2){
		        m2=costs[0][i];
		    }
		}
		
		int cm1=Integer.MAX_VALUE;
		int cm2=Integer.MAX_VALUE;
		
		for(int j=1;j<n;j++){
		    for(int i=0;i<k;i++){
		        if(dp[j-1][i]==m1)
		            dp[j][i]=costs[j][i]+m2;
		        else
		            dp[j][i]=costs[j][i]+m1;
		           
		        if(dp[j][i]<cm1){
		            cm2=cm1;
		            cm1=dp[j][i];
		        }
		        else if(dp[j][i]<cm2){
		            cm2=dp[j][i];
		        }
		    }
		    
		    m1=cm1;
		    m2=cm2;
		    cm1=Integer.MAX_VALUE;
		    cm2=Integer.MAX_VALUE;
		}
		return m1;
	}
}
