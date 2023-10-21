class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        int k;
        int i=1;
        while(i<=N){
            k=N/i;
            sum=sum+i*k;
            i++;
        }
        return sum;
    }
}
