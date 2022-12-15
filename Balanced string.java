class Solution {
    static String BalancedString(int N) {
        // code here
        StringBuffer ans=new StringBuffer();
        int i=0,j=25;
        
        for(i=0;i<N/26;i++){
            ans.append("abcdefghijklmnopqrstuvwxyz");
        }
        
        if(N%2==0){
            N=N%26;
            for(i=0;i<N/2;i++)
                ans.append((char)(i+'a'));
            
            for(j=26-(N/2);j<=25;j++)
                ans.append((char)(j+'a'));
        }
        
        else{
            int sum=0, temp=N;
            N=N%26;
            while(temp>0){
                sum=sum+(temp%10);
                temp=temp/10;
            }
            
            if(sum%2==0) {
            for(i=0;i<(N+1)/2;i++) 
                ans.append((char)(i+'a'));
            for(j=26-((N-1)/2);j<=25;j++) 
                ans.append((char)(j+'a'));
            }
        
            else {
                for(i=0;i<(N-1)/2;i++) 
                    ans.append((char)(i+'a'));
                for(j=26-(N+1)/2;j<=25;j++) 
                    ans.append((char)(j+'a'));
            }
        }
        return ans.toString();
    }
}
