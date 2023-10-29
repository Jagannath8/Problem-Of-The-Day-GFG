class CheckBit{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k){
        // Your code here
        for(int i=1;i<=k;i++)
            n=n/2;
        if(n%2==1)
            return true;
        return false;
    }
}
