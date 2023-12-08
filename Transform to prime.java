class Solution{
    public int minNumber(int arr[], int N){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(isPrime(sum)) 
            return 0;
        for(int i=1;i<=100;i++){
            sum+=i;
            if(isPrime(sum)) 
                return i;
             sum-=i;
        }
        return 0;
    }
    
    private boolean isPrime(int n){
        if(n==2) 
            return true;
        if(n==1) 
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) 
                return false;
        }
        return true;
    }
}
