class Solution{
    public int minStep(int n){
        // code here
        int cnt=0;
        while(n!=1){
            if(n%3==0)
                n=n/3;
            else
                n=n-1;
            cnt++;
        }
        return cnt;
    }
}
