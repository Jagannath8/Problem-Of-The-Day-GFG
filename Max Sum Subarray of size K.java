class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int l=0;
        long maxi=0,psum=0;
        for(int i=0;i<N;i++){
            if(i<K)
                psum+=Arr.get(i);
            else{
                maxi=Math.max(psum,maxi);
                psum+=Arr.get(i); 
                psum-=Arr.get(l);
                l++;
            }
        }
        maxi=Math.max(psum,maxi);
        return maxi;
    }
}
