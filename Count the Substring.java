class Solution {
    long countSubstring(String S){
        int n=S.length();
        long dp[]=new long[2*n+1];
        int cnt=n;
        int minus=0;
        
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='0')
                cnt--;
            else
                cnt++;
            if(cnt<=n)
                minus++;
            
            dp[cnt]++;
        }
        
        long ans=0L;
        int idx=n;
        for(int i=0;i<n;i++){
            ans+=(n-i-minus);
            if(S.charAt(i)=='1'){
                idx++;
                dp[idx]--;
                minus+=dp[idx];
            }
            
            else{
                minus--;
                minus-=dp[idx];
                idx--;
                dp[idx]--;
            }
        }
        
        return ans;
    }
}
