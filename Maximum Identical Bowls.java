class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long sum = 0;
        for(int i:arr){
            sum += i;
        }
        
        while(N>1){
            if(sum%N==0)
                return N;
            N--;
        }
        return 1;
    }
}
