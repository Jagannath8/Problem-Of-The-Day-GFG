class Solution {
    public static int distributeTicket(int N,int K){
        int start = 1; 
        int end = N;
        boolean flag = true;
        while(start < end && end -start >= K){
            if(flag){
                start = start + K;
                flag = false;
            }
            else{
                end = end - K;
                flag = true;
            }
        }
        
        if(flag)
            return end;
            
        return start;
    }
}
