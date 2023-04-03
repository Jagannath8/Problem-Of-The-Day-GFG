class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
        int curr=0, rem=0;
        for(int i=0;i<x.length();i++){
            curr=rem*10+x.charAt(i)-'0';
            rem=curr%11;
        }
        return rem;
	}
} 
