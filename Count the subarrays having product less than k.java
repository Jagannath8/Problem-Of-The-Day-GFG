class Solution {
    public int countSubArrayProductLessThanK(long a[], int n, long k){
        int count=0;
        long cur=1;
        for(int i=0; i<a.length; i++){
            cur=1;
            for(int j=i; j<a.length; j++){
                cur*=a[j];
                if(cur>=k) break;
                else count++;
            }
        }
        return count;
    }
}
