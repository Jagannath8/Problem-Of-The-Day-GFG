class Solution{
    public  static int specialPalindrome(String a, String b){
       //Code Here
        int l1=a.length();
        int l2=b.length();
        if(l1<l2)
            return -1;
            
        int ans=Integer.MAX_VALUE;
        char s1[]=a.toCharArray();
        char s2[]=b.toCharArray();
        for(int i=0;i<l1-l2+1;i++){
            char temp[]=(a.substring(0,i) + b + a.substring(i+l2)).toCharArray();
            int cost=0;
            for(int j=i;j<i+l2;j++){
                if(s1[j]!=temp[j])
                    cost++;
            }
            
            int is_palin=1;
            for(int j=0;j<Math.ceil(l1/2.0);j++) { 
                if((j<i || j>=i+l2) && temp[j]!=temp[l1-j-1]) 
                    cost++;

                else if((l1-i-1<j || l1-i-l2-1>=j) && temp[j]!=temp[l1-j-1])     
                    cost++;

                else if(temp[j]!=temp[l1-j-1]){
                    is_palin=0;
                    break;
               }
            }
            
            if(is_palin==1)
                ans=Math.min(ans,cost);
        }
        
        if(ans == Integer.MAX_VALUE)
            return -1;
          
        return ans;
    }
}
