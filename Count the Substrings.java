class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int count=0, ans=0;
        for(int i=0;i<S.length();i++){
            count=0;
            for(int j=i;j<S.length();j++){
                if(S.charAt(j)>='a' && S.charAt(j)<='z')
                    count++;
                
                else
                    count--;
                
                if(count==0)
                    ans++;
            }
        }
        
        return ans;
    }
}
