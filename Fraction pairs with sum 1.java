class Solution {
    public static int countFractions(int n, int[] num, int[] den) {
        // code here
        HashMap <Double,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++){
            double frac = (double)num[i]/(double)den[i];
            double req = (double)(den[i] - num[i])/(double)den[i];
            count += map.getOrDefault(req,0);
            map.put(frac, map.getOrDefault(frac,0) + 1);
            
        }
        return count;
    }
}
