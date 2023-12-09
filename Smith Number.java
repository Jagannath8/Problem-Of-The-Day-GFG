class Solution {
    static int smithNum(int n) {
        // code here
        int primeSum = 0;
        int sum = sumOfDigits(n);
        ArrayList<Integer> list = new ArrayList<>();
        list = factors(n);
        for(int i:list){
            if(isPrime(i)){
                primeSum += sumOfDigits(i);
            }
        }
        int val = primeSum == sum? 1 :0;
        return val;
    }
    
    static int sumOfDigits(int n){
        int sum =0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem;
        }
        return sum;
    }
    
    static boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    
    static ArrayList<Integer> factors(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=n/2;i++){
            int temp = n;
            while(temp%i==0){
                temp = temp/i;
                list.add(i);
            }
        }
        return list;
    }
};
