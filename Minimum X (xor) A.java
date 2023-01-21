class Solution {
    
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if(n%2==1)
                count++;
                
            n/=2;
        }
        return count;
    }
    
    public static int minVal(int a, int b) {
        // code here
        int a1=countSetBit(a);
        int b1=countSetBit(b);
        int ans=a;
        
        if(a1==b1)
            return a;
        
        else if(a1>b1){
            int idx=0;
            while(a1!=b1){
                if(a%2==1){
                    a1--;
                    ans-=(1<<idx);
                }
                idx++;
                a/=2;
            }
        }
        
        else{
            int idx=0;
            while(a1!=b1){
                if(a%2==0){
                    a1++;
                    ans+=(1<<idx);
                }
                idx++;
                a/=2;
            }
        
        }
        
        return ans;
    }
}
