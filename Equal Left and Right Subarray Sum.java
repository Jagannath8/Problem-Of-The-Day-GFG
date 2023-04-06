class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		long totalSum = 0 ;
		for(int i :A)
		totalSum += i ;
		
		long prefixSum =0;
		for(int i = 0  ;i<N;i++)
		{
		    totalSum -= A[i] ;
		    
		    if(totalSum == prefixSum)
		    return i+1 ;
		    else
		    prefixSum += A[i] ;
		}
		return -1 ;
	}
}
