class Solution{
    int carpetBox(int a, int b, int c, int d) { 
        //code here
        return Math.min(solve(a,c) + solve(b,d), solve(a,d) + solve(b,c));
    }
    
    int solve(int x, int y){
        int ans=0;
        while(x>y){
            ans++;
            x=x/2;
        }
        
        return ans;
    }
}
