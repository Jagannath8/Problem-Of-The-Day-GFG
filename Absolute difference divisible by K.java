class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		int mod[]=new int[k];
		for(int i:arr){
		    int rem=i%k;
		    mod[rem]++;
		}
		
		int ans=0;
		for(int i:mod){
		    ans+=(i*(i-1))/2;
		}
		return ans;
	}
}
