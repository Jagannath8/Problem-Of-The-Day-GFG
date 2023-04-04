class Solution{
	int minSteps(String str) {
		//Write your code here
		int ans=0;
		for(int i=1;i<str.length();i++){
		    if(str.charAt(i-1)!=str.charAt(i))
		        ans++;
		}
		
		if(ans%2!=0)
		    return (ans+1)/2+1;
		    
		return ans/2+1;
	}
}
