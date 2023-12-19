class Solution{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n){
        // Your code here        
        int count=0;
        if(m==n)
            return -1;
        
        while(m!=0 || n!=0){
            int d1=m%2;
            int d2=n%2;
            count++;
            if(d1!=d2)
                break;
            m/=2;
            n/=2;
        }
        return count;
    }
}
