class Solution {
    long wineSelling(int arr[],int n){
        long sum=0,ans=0;
        for(int i:arr){
            sum+=i;
            ans+=Math.abs(sum);
        }
        return ans;
    }
}
