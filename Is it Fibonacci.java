class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        long sum=0;
        List<Long> ans=new ArrayList<>();
        for(long x: GeekNum){
            sum+=x;
            ans.add(x);
        }
        
        int start=0;
        while(ans.size()<N){
            ans.add(sum);
            sum+=sum;
            sum-=ans.get(start);
            start++;
        }
        
        return ans.get(N-1);
    }
}
