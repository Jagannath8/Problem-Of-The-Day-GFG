class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        List<Long> ans=new ArrayList<>();
        long len=gcd(L,B);
        long num=(L*B)/(len*len);
        ans.add(num);
        ans.add(len);
        return ans;
    }
    
    static long gcd(long a, long b){
        if(b==0)
            return a;
        
        return gcd(b, a%b);
    }
}
